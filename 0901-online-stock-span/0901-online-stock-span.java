class StockSpanner {
    Stack<Integer> s=new Stack<>();
    ArrayList<Integer> stocks=new ArrayList<>();

    public StockSpanner() {

    }
    
    public int next(int price) {
        int i=stocks.size();
        stocks.add(price);
        while(!s.isEmpty() && price>=stocks.get(s.peek())){
            s.pop();
        }
        int span;
        if(s.isEmpty()){
            span=i+1;
        }
        else{
            span=i-s.peek();
        }
        s.push(i);
        return span;

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */