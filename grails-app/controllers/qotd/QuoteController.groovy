package qotd

class QuoteController {

    def index() { }
    def home(){
        render "<h1>This is the quote of the day</h1>"
    }

    def random() {
        def allQuotes = Quote.list();
        def randomQuote;
        println("SIZE "+ allQuotes.size());
        if(allQuotes.size() > 0) {
            def randomIndex = new Random().nextInt(allQuotes.size());
            randomQuote = allQuotes.get(randomIndex);
        } else {
            def staticQuote = new Quote(author : "Abhishek Chauhan", content : "This is the static quote of the day");
            randomQuote = staticQuote;
        }
        [quote : randomQuote];
    }
}
