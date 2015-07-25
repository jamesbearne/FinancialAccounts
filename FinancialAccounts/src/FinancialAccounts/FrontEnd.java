/*
package financialAccount;

//code is an example of creating a user form with SWT. It accepts some inputs
//but doesn't validate them and passes them to FinancialAccount class.

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;

public class InputTransaction {

	protected Shell shell;
	private Text textAccountId;
	private Text textStartBalance;
	private Text textDate;
	private Text textAmount;
	private Text textCreditDebit;
	private Text textTransactionType;
	private Text textEndBalance;

	/**
	 * Launch the application.
	 * @param args
	 
	public static void main(String[] args) {
		try {
			InputTransaction window = new InputTransaction();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Open the window
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 430);
		shell.setText("Input Account Transaction Details");
		
		//Cancel button + actions
		Button buttonCancel = new Button(shell, SWT.NONE);
		buttonCancel.setBounds(349, 357, 75, 25);
		buttonCancel.setText("Cancel");
		buttonCancel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				switch (e.type) {
				case SWT.Selection:
					System.exit(0);
				}
			}
		});
		
		//Submit button + actions
		Button buttonSubmit = new Button(shell, SWT.NONE);
		buttonSubmit.setBounds(268, 357, 75, 25);
		buttonSubmit.setText("Submit");
		buttonSubmit.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				switch (e.type) {
				case SWT.Selection:
					String accountId = textAccountId.getText();
					String startBalanceVal = textStartBalance.getText();
					String dateTimeVal = textDate.getText(); 
					String transactionAmountVal = textAmount.getText();
					String creditDebitVal = textCreditDebit.getText();
					String transactionTypeVal = textTransactionType.getText();
					String endBalanceVal = textEndBalance.getText();
					
					FinancialAccount.CreateXMLTransaction(accountId, startBalanceVal, dateTimeVal, transactionAmountVal, 
							creditDebitVal, transactionTypeVal, endBalanceVal);
				}
			}
		});
		
		textAccountId = new Text(shell, SWT.BORDER);
		textAccountId.setBounds(46, 51, 113, 21);
		
		textStartBalance = new Text(shell, SWT.BORDER);
		textStartBalance.setBounds(46, 99, 113, 21);

		textDate = new Text(shell, SWT.BORDER);
		textDate.setBounds(46, 147, 113, 21);
		//DateTime dateTime = new DateTime(shell, SWT.BORDER);
		//dateTime.setBounds(46, 147, 113, 21);
		
		textAmount = new Text(shell, SWT.BORDER);
		textAmount.setBounds(46, 195, 113, 21);
		
		textCreditDebit = new Text(shell, SWT.BORDER);
		textCreditDebit.setBounds(46, 243, 113, 21);
		//Combo combo = new Combo(shell, SWT.NONE);
		//combo.setBounds(46, 243, 113, 21);
		//combo.add("Credit");
		//combo.add("Debit");
		
		textTransactionType = new Text(shell, SWT.BORDER);
		textTransactionType.setBounds(46, 291, 113, 21);
		
		textEndBalance = new Text(shell, SWT.BORDER);
		textEndBalance.setBounds(46, 339, 113, 21);
		
		Label label_7 = new Label(shell, SWT.NONE);
		label_7.setBounds(46, 222, 113, 15);
		label_7.setText("Credit or Debit:");
		
		Label label_6 = new Label(shell, SWT.NONE);
		label_6.setBounds(46, 270, 113, 15);
		label_6.setText("Transaction Type:");
		
		Label label_5 = new Label(shell, SWT.NONE);
		label_5.setBounds(46, 318, 113, 15);
		label_5.setText("Finishing Balance:");
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setBounds(46, 174, 113, 15);
		label_4.setText("Amount:");
		
		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setBounds(46, 126, 113, 15);
		label_3.setText("Date of Transaction:");
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setBounds(46, 78, 113, 15);
		label_2.setText("Starting Balance:");
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBounds(46, 30, 113, 15);
		label_1.setText("Acount ID:");
	}
}

*/