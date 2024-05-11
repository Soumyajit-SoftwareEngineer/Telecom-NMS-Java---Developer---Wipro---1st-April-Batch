package HibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Client {
	
	private static SessionFactory factory;

	//Connects with the db. Creates sessionFactory object. With this object

	// you can create a session, i.e., a connection is established between client and server.

	public static void getSessionFactory() {

	try {

	Configuration conf = new Configuration().configure();

	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
	
	factory = conf.buildSessionFactory(builder.build());
	}catch (Exception ex) {

	System.out.println(ex);

	}
	}
	public static void main (String args[]) { 
		getSessionFactory();

	Client clientObj = new Client();

	//Inserts record in the db. 
	//clientObj.insertRecordInDatabase (75, "Soumyajit", "Mondal", 40000);

	//Display all the records using HQL klientObj.displayRecords();

	//Display the records using native Query. 
	//clientObj.displayRecordsUsing NativeQuery();

	//Update the data in the db. 
	//clientObj.updateRecord(75, "Soumyajit");

	//Delete record from the db. 
	//clientObj.deleteRecord (13);

	}
	
	//Inserts a record in the db.

	public void insertRecordInDatabase (int id, String firstName, String lastName, int sal) {
	Session session = factory.openSession(); 
	Transaction tx = session.beginTransaction();
	Employee empObj = new Employee (id, firstName, lastName, sal);
	session.save(empObj);
	tx.commit();
	System.out.println("Record inserted in the db successfully...");
	session.close();

	}

	//Display all the records using HQL (Hibernate Query Language) public void displayRecords() {

	Session session = factory.openSession();
	
	//HQL - Hibernate Query Language..
	//Select * from hibernate_create_insert_update_delete List<Employee> empLst = session.createQuery("FROM Employee").list();

	for (Employee empobj: empLst) { System.out.println(empobj);
	}
	session.close();

	}

//Displays the records using native SQL Query. public void displayRecordsUsingNativeQuery() {

Session session = factory.openSession();

String str = "SELECT from hibernate_create_insert_update_delete WHERE salary >= 10000"; SQLQuery(str); SQL Query query session.createSQL Query (str);

queny.addEntity(Employee.class);

List<Employee> empLst = query.list();

for (Employee empobj: empLst) System.out.println(empObj);

session.close();

}

//Update the record in the db.

public void updateRecord (int id, String firstName) {

Session session = factory.openSession();

Transaction tx = session.beginTransaction();

//SELECT FROM hibernate_create_insert_update_delete WHERE id = given id

Employee empObj = (Employee) session.get(Employee.class, id);

empObj.setFirstName(firstName);

session.update(empobj);

tx.commit();

System.out.println("Gien record is upated in the db successfully...");

session.close();

}

//Deletes the record from the db.

public void deleteRecord (int id) {

Session session = factory.openSession();

Transaction tx = session.beginTransaction();

Employee empobj = (Employee) session.get(Employee.class, id); 
session.delete(empObj);

tx.commit();

System.out.println("Record with id "+ id +" is deleted successfully"); 
session.close();

}

}
