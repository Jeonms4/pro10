package sec04.ex01;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

// HttpSessionBindingListener 세션에 바인딩되거나 바인딩 해제될 때 개체에 알림이 표시되도록 합니다.
public class LoginImp1 implements HttpSessionBindingListener{
	String user_id;
	String user_pw;
	static int total_user = 0;

	public LoginImp1() {
		
	}

	public LoginImp1(String user_id, String user_pw) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("사용자 접속");
		++total_user;
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("사용자 접속 해제");
		total_user--;
	}
	
}
