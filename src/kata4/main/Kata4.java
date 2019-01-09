package kata4.main;

import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;
import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        String fileName = new String(".\\src\\kata4\\emails.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);

        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
    }
    
}
