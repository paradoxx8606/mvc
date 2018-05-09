package ttt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Action;
import model.ActionData;
import model.BoardDAO;

public class InsertForm implements Action{

	@Override
	public ActionData execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ActionData res = new ActionData();
		
		request.setAttribute("main", "insertForm.jsp");
		
		return res;
	}
}
