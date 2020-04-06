package OPP.MatrixSpur;

public class NonSquareArrayException extends Exception{
	private String message;

	public NonSquareArrayException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
