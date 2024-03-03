package visitor;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import location.DistBean;
import location.RegistDAO;
import location.State;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class VisitorAction extends DispatchAction{

	public ActionForward insertVisitor(ActionMapping m, ActionForm f,HttpServletRequest req,HttpServletResponse res)
	{
 
		List<State> list = RegistDAO.getStateList();
		req.setAttribute("lst", list);
return m.findForward("vEntry");
	
	}
	
	public ActionForward getDistList(ActionMapping m, ActionForm f,HttpServletRequest req,HttpServletResponse res)
	{
 
		String stCode = req.getParameter("stcode");
		 List<DistBean> list = RegistDAO.getDistList(stCode);
		req.setAttribute("dlst", list);
		List<State> slist = RegistDAO.getStateList();
		req.setAttribute("lst", slist);
       return m.findForward("vdEntry");
	
	}
	
	public ActionForward saveDetail(ActionMapping m, ActionForm f,HttpServletRequest req,HttpServletResponse res) throws IllegalAccessException, InvocationTargetException
	{
		VisitorBean vbean = (VisitorBean)f;
		VisitorDTO vdto = new VisitorDTO();
		 BeanUtils.copyProperties(vdto, vbean);
		 RegistDAO r = new RegistDAO();
		  if(r.saveDetail(vdto)>0)
		  {
			 req.setAttribute("save", "DATA Successfull Regist");
		  }
		  else
		  {
			  req.setAttribute("unsave", "DATA unSuccessfull Regist");
		  }
		  return m.findForward("vEntry");
		
 
	}
	
}
