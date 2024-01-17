package sub14;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnok = new Button();

		class okListener implements Button.ClickListener {
			public void onClick() {
				System.out.println("ok버튼을 클릭했습니다.");
			}
		}
		btnok.setClickListener(new okListener());

		btnok.click();

		Button btnCancel = new Button();

		class CancelListener implements Button.ClickListener {
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭하였습니다.");
			}
		}
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
	}

}
