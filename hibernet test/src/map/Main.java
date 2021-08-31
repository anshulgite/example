package map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anshul.mypackage.configure;

public class Main {

	public static void main(String[] args) {
		configure cf=new configure();
		Transaction t=cf.t;	
		Session session=cf.session;
		Info info=new Info();
		Address address=new Address();
		
		info=(Info)session.get(Info.class,102);
		
		System.out.println(info.getName()+"\t"+info.getLname()+"\t"+info.getEmail());
		System.out.println(info.getAdd_id().getCity()+"\t"+info.getAdd_id().getState()+"\t"+info.getAdd_id().getContry());
		System.out.println(info.getRoll().getStd()+"\t"+info.getRoll().getSub()+"\t"+info.getRoll().getGrad());
		
//		info.setId(102);
//		info.setName("rajat");
//		info.setLname("gite");
//		info.setEmail("rajatgite@gmail.com");
//		
//		address.setAd_id(2);
//		address.setContry("india");
//		address.setState("mp");
//		address.setCity("indore");
//		address.setBlock("hari");
//		info.setAdd_id(address);
//		
//		Student stu=new Student();
//		stu.setRoll(9102);
//		stu.setStd("11th");
//		stu.setSection("A");
//		stu.setSub("it");
//		stu.setGrad("B+");
//		info.setRoll(stu);
//		
//		session.save(stu);
//		session.save(address);
//		session.save(info);
		t.commit();
		
		
	}

}
