package top.acyone.model.common.wxpay;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyConfig extends WXPayConfig {

	  private byte[] certData;

	    public MyConfig() throws Exception {
	        String certPath = "/path/to/apiclient_cert.p12";
	        File file = new File(certPath);
	        InputStream certStream = new FileInputStream(file);
	        this.certData = new byte[(int) file.length()];
	        certStream.read(this.certData);
	        certStream.close();
	    }

	    public String getAppID() {
	        return "wxa75115dccbe8ecec";
	    }

	    public String getMchID() {
	        return "1450755702";
	    }

	    public String getKey() {
	        return "medusa18058505737medusa180585057";
	    }

	    public InputStream getCertStream() {
	        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
	        return certBis;
	    }

	    public int getHttpConnectTimeoutMs() {
	        return 8000;
	    }

	    public int getHttpReadTimeoutMs() {
	        return 10000;
	    }

		@Override
		IWXPayDomain getWXPayDomain() {
			return WXPayDomainSimpleImpl.instance();
		}
}
