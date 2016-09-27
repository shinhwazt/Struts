package Demo.Action;

public class HandlerAction {
	private String username;
	private String password;
	public String register() throws Exception{
		try {
			System.out.println(username);
			System.out.println(password);
			return "success";
		} catch (Exception e) {
			return "error";
		}
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
