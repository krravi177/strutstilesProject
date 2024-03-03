package max;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class LoginAction extends DispatchAction{

	public ActionForward login(ActionMapping m, ActionForm f,HttpServletRequest req,HttpServletResponse res)
	{
		LoginBean lb = (LoginBean)f;
		System.out.println("in action-");
		if(lb.getUid().equalsIgnoreCase("admin")&&lb.getPass().equalsIgnoreCase("admin"))
		{
			return m.findForward("admin");
		}
		else
		{
			return m.findForward("user");
		}
		
		
		 
	}
}
