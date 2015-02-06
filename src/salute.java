public class salute {

	private String str = "asim";
	public String str_pub = "asim_pub";

	public void doSome() {
		try {
			System.out.println("Hello there parent");
			System.out.println("salute.doSome()");
			System.out.println("salute.doSome()" + str);
			if (str_pub == "uygde") {
				throw new ChecKex();
			}
			throw new MyasimException();

		} catch (MyasimException e) {
			// TODO: handle exception
		} catch (ChecKex e) {
			// TODO: handle exception
		}

		catch (Exception e) {
			// TODO: handle exception
			//Me11
		}
	}

}
//Check for V2 tag