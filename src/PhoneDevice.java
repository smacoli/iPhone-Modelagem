public interface PhoneDevice {
    public void call(String phoneNumber);
    public void answerPhoneCall(String phoneNumber);
    public void startVoiceMail(String message, String messageReceiver);
}
