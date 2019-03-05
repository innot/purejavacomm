package purejavacomm;

@SuppressWarnings("serial")
public class PureJavaIllegalStateException extends IllegalStateException {

	public PureJavaIllegalStateException(String message) {
		super(message);
	}

	public PureJavaIllegalStateException(Exception e) {
		super(e);
	}
}
