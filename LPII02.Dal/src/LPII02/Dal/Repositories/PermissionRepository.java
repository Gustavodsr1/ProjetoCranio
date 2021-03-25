/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LPII02.Dal.Repositories;

import LPII02.Dal.Orm.HibernateUtil;
import LPII02.Domain.Entities.Permission;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Gustavo
 */
public class PermissionRepository extends BaseRepository<Permission> {

    public PermissionRepository() {
        super(Permission.class);
    }

    public Permission getByCode(int code) throws Exception {
        try {
            if (!this._session.isOpen()) {
                this._session = HibernateUtil.getSessionFactory().openSession();
            }

            Query query = this._session.createQuery("from " + this._class.getName() + " where code=" + code);
            List<Permission> result = query.list();

            if (result == null || result.size() == 0) {
                return null;
            }

            return result.get(0);
        } catch (Exception ex) {
            throw new Exception("Ocorreu um erro ao recuperar a permissão pelo código passado, "
                    + "tente novamente ou contate a equipe responsável.");
        } finally {
            this._session.close();
        }
    }
}
