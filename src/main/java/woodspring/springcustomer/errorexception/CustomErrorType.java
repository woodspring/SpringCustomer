package woodspring.springcustomer.errorexception;

public class CustomErrorType {
	private String errMsg;
	public CustomErrorType(String msg) {
		errMsg = msg;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	@Override
	public String toString() {
		return "CustomErrorType [errMsg=" + errMsg + "]";
	}


}
