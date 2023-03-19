package lesson021;

public enum EErrorType {

	OUT_OF_BOUNDS(1001, "Sınırlarının dışında!!!"),
	SEAT_ALREADY_OCCPUIED(1002, "Seçilen yer dolu!!!"),
	TOO_LOW_WEIGHT(1003,"100 kilo altındaki yükler kabul edilemez!!!"),
	OUT_OF_SHIFT_DAY(1004, "cuma günleri ürün kabul edemiyoruz"),
	EXPIRED_DATE(1005,"Geçmiş Bir Tarih giremezsiniz");

	private String message;
	private int code;

	private EErrorType() {

	}

	private EErrorType(int code, String message) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

}
