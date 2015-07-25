/* Purpose: Class creates and XML schema to represent a 'FinancialAccounts' transaction.
 * Author: James Bearne
 * Last Updated: 05 July 2015
 */
package FinancialAccounts;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Attr;

public class CreateXMLFiles {
	
	public static void main(String args[]) {
		
		CreateXMLTransaction("1", "-545.00", "29-06-2015 00:00:00.000", "2395.36", "CR", "Pay Check", "1312.66");	
	}
	
	public static void CreateXMLTransaction(String accountId, String startBalanceVal, String dateTimeVal, 
			String transactionAmountVal, String creditDebitVal, String transactionTypeVal, String endBalanceVal) {
		
		System.out.println("Starting XML schema processing...");
		
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			//root elements for XML file
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("FinancialAccountTransaction");
			doc.appendChild(rootElement);
			
			//account elements for XML file
			Element account = doc.createElement("Account");
			rootElement.appendChild(account);
			
			// set attribute for account element
			Attr attr = doc.createAttribute("id");
			attr.setValue(accountId);
			account.setAttributeNode(attr);
			
			//StartBalance elements for XML file
			Element startBalance = doc.createElement("StartBalance");
			startBalance.appendChild(doc.createTextNode(startBalanceVal));
			account.appendChild(startBalance);
	 
			//DateTime elements for XML file
			Element dateTime = doc.createElement("DateTime");
			dateTime.appendChild(doc.createTextNode(dateTimeVal));
			account.appendChild(dateTime);
	 
			//TransactionAmount elements for XML file
			Element transactionAmount = doc.createElement("TransactionAmount");
			transactionAmount.appendChild(doc.createTextNode(transactionAmountVal));
			account.appendChild(transactionAmount);
	 
			//CreditDebit elements for XML file
			Element creditDebit = doc.createElement("CreditDebit");
			creditDebit.appendChild(doc.createTextNode(creditDebitVal));
			account.appendChild(creditDebit);
			
			//TransactionType elements for XML file
			Element transactionType = doc.createElement("TransactionType");
			transactionType.appendChild(doc.createTextNode(transactionTypeVal));
			account.appendChild(transactionType);
			
			//EndBalance elements for XML file
			Element endBalance = doc.createElement("EndBalance");
			endBalance.appendChild(doc.createTextNode(endBalanceVal));
			account.appendChild(endBalance);
			
			//Write the content into XML file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			//StreamResult result = new StreamResult(new File("C:\\Users\\Jbearne\\Desktop\\FinancialAccountTransaction.xml"));
			
			// Output to console for testing
			StreamResult result = new StreamResult(System.out);
			transformer.transform(source, result);
		} 
		
		catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		}
		
		catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}
}