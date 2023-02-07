package javaMid8.exp422;

public class Chatting {
class Chat {    
	void start() {}
	void sendMessage(String message) {}
}
void startChat(String chatId) {
//	String nickName=null;   //이게 파이널로 고정되어있음
	String nickName=chatId;
	
	Chat chat=new Chat() {
		@Override
		void start() {
			while(true) {
		String inputData="안녕";
				String message="["+nickName+"]"+inputData;
		sendMessage(message);
			}
		}
	
};
chat.start();
}
}