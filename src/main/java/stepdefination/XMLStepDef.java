package stepdefination;

import cucumber.api.java.en.Then;
import pages.XML;

import utilities.TestBase;

public class XMLStepDef extends TestBase{

	   @Then("Home page")
	    public void Home_page() {
	        XML.Home.click();
	        act.pause(1000).perform();
	    }

	    @Then("View Transmittals")
	    public void View_Transmittals() {
	        XML.ViewTransmittals.click();
	        act.pause(2000).perform();
	    }

	    @Then("check submission")
	    public void check_submission() {
	    	XML.ViewSubmition.click();
	    	act.pause(3000).perform();
	    	XML.ClickTheName.click();
	    	act.pause(3000).perform();
	    	XML.ClickView.click();
	    	act.pause(5000).perform();
	    	driver.navigate().to("https://enroll-sandbox.afba.com/enrollment-case/61/census/2628");
	    	act.pause(4000).perform();
	    	XML.ClickSecondView.click();
	    	act.pause(5000).perform();
	    
	    }
	    
	    
//	    @Then("Download XML file")
//	    public void check_Download_Data_from_XML_file() {
//	    	String st = XML.DawnloadData.getText();
//	    	System.out.println(st);
//	    	
//	    	String getUrl=XML.DawnloadData.getAttribute("href");
//			System.out.println("Image source URL : \n"+ getUrl + "\n");
//			act.pause(3000).perform();
	    	
//	    	XML.DawnloadData.click();
//	       act.pause(3000).perform();
	       
//	       Alert alert = driver.switchTo().alert();	
//	       alert.equals("Save File");
//	       
//	       alert.accept();
//	   
	       
	//    }
}
	       
	       /**
	        String downloadFilepath = "C:\\Users\\MAbabaikeli\\Downloads";

	        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

	        chromePrefs.put("profile.default_content_settings.popups", 0);

	        chromePrefs.put("download.default_directory", downloadFilepath);

	        chromePrefs.put("safebrowsing.enabled", "true"); 

	        ChromeOptions options = new ChromeOptions();

	        options.setExperimentalOption("prefs", chromePrefs);

	        DesiredCapabilities cap = DesiredCapabilities.chrome();

	        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

	        cap.setCapability(ChromeOptions.CAPABILITY, options);

	         driver = new ChromeDriver(cap);
	         **/
	    
	       
	       
	       /**
	        //Java URL and URLConnection - read content from a URL
	        
	        StringBuilder content = new StringBuilder();
	        
	        try {
	        	
	        	URL url = new URL("https://enroll-sandbox.afba.com/enrollment-submissions");
	        	
	        	  URLConnection urlConnection = url.openConnection();

	              BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

	              String line;

	              while ((line = bufferedReader.readLine()) != null)
	            	  
	              {
	            	  
	                content.append(line + "\n");
	                
	              }
	              
	              bufferedReader.close();
	              
	            }
	        
	            catch(Exception e)
	        
	            {
	            	
	              e.printStackTrace();
	              
	            }
	        
	            return content.toString();
	            
	          }
	        }

	        **/
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

