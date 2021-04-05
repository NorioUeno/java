package crackingTheCodingInterview.objectDesign.customerCenter;

public class Customer {

  public static void main(String[] args) throws Exception {

    Reception reception = new Reception();

    Call call = new Call();
    call.setMessage("うごかない");

    Res res = reception.dispatchCall(call);

  }

}
