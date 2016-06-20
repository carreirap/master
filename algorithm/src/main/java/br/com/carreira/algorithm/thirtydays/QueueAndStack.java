package br.com.carreira.algorithm.thirtydays;

public class QueueAndStack {
	
	StringBuilder queue = new StringBuilder();
    StringBuilder stack = new StringBuilder();
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueAndStack q= new QueueAndStack();
		String s = "yes";
		for (int i = 0; i < s.length(); i++) {
			q.pushCharacter(s.charAt(i));
			q.enqueueCharacter(s.charAt(i));
			System.out.println(i);
		}
		System.out.println(q.stack);
		System.out.println(q.queue);
		for (int i = 0; i < s.length(); i++) {
			System.out.println(q.popCharacter());
			System.out.println(q.dequeueCharacter());
		}
		
	}
	
	
	
    // Write your code here.
    
    
    void pushCharacter(char ch) {
         stack.append(ch);
    }
    
    void enqueueCharacter(char ch) {
    	queue.append(ch);
        
    }
    
    char popCharacter() {
    	char c= stack.charAt(0);
    	stack.deleteCharAt(0);
        return c;
    }
    
    char dequeueCharacter() {
    	char c= queue.charAt(queue.length() - 1);
    	queue.deleteCharAt(queue.length() - 1);
        return c;
    }

}
