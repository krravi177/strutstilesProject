package visitor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class ViewVisitorAction extends DispatchAction{
	public ActionForward viewVisitor(ActionMapping m, ActionForm f,HttpServletRequest req,HttpServletResponse res)
	{
		VisitorDAO vdao = new VisitorDAO();
		List<VisitorDTO> list = vdao.view();
		System.out.println("list "+list.size());
		req.setAttribute("lst", list);
		return m.findForward("view");
		
	}
	
	public ActionForward search(ActionMapping m, ActionForm f,HttpServletRequest req,HttpServletResponse res)
	{
		return m.findForward("Search");
		
	}
}
