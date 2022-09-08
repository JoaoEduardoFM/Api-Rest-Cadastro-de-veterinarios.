package application;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import resource.VeterinarioResource;


@ApplicationPath(value = "/rest")
public class RestAPI extends  Application {
	
	private Set <Object> singletons = new HashSet<Object>();
	
	public RestAPI() throws ClassNotFoundException, SQLException{
		this.singletons.add(new VeterinarioResource());
	}
	
	@Override
	public Set<Object> getSingletons() {
		return this.singletons;
	}
}
