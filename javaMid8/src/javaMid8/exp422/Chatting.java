package javaMid8.exp422;

public class Chatting {
class Chat {    
	void start() {}
	void sendMessage(String message) {}
}
void startChat(String chatId) {
//	String nickName=null;   //�̰� ���̳η� �����Ǿ�����
	String nickName=chatId;
	
	Chat chat=new Chat() {
		@Override
		void start() {
			while(true) {
		String inputData="�ȳ�";
				String message="["+nickName+"]"+inputData;
		sendMessage(message);
			}
		}
	
};
chat.start();
}
}