package exa.edu.ups.jpa;

import java.util.List;

import exa.edu.ups.dao.DAOFactory;
import exa.edu.ups.dao.PhoneDAO;
import exa.edu.ups.dao.UserDAO;
import exa.edu.ups.modelo.Phone;
import exa.edu.ups.modelo.User;

public class JPAPhoneDAO extends JPAGenericDao<Phone, Integer> implements PhoneDAO {

	public JPAPhoneDAO() {
		super(Phone.class);
	}
	
	@Override
	public List<Phone> findByUserId(String cedula) {
        String jpql = "FROM Phone p WHERE p.user_cedula = '" + cedula + "'";
        List<Phone> phones = (List<Phone>) em.createQuery(jpql).getResultList();
        return phones;  
	}

	@Override
	public List<Phone> findByNumber(String numero, String cedula) {
		UserDAO userDao = DAOFactory.getDAOFactory().getUserDAO();
        User user = userDao.findById(cedula);
        user.getTelefonos().size();
        if(user.getTelefonos().contains(numero)) {
        	 return null;
        }
        return null;
       
	}

}
