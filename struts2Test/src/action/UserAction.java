package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private User u;
	private boolean show;
	private InputStream json;

	public String reg() {
		ActionContext context = ActionContext.getContext();
		context.put("user", u);
		JSONArray jsa = new JSONArray();
		for (String s : u.getFavs())
			jsa.add(s);

		JSONObject jso = new JSONObject();
		jso.put("name", u.getName());
		jso.put("sex", u.getSex());
		jso.put("fav", jsa);
		jso.put("salary", u.getSalary());
		json = new ByteArrayInputStream(jso.toString().getBytes());
		return show ? SUCCESS : "json";
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

	public boolean isShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public InputStream getJson() {
		return json;
	}

	
	@Override
	public void validate() {
		String loginName=u.getName();
		if(loginName==null || loginName.trim().length()<=3){
			addFieldError("u.name", "名字必须大于三位！");
		}
		
		double salary=u.getSalary();
		if(salary<0 || salary>=10000){
			addFieldError("u.salary", "工资数据有误！");
		}
		
	}

	
}
