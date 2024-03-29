package sample.book.demo.kapitel08.schuhetester;

import java.util.Collection;


/**
 * 
 * @author Philip Ackermann
 *
 */
public interface SolcheSchuheHastDuSchonTester
{
    void addSchuhPaar(SchuhPaar schuhPaar);
    
    boolean hastDuSchon(SchuhPaar schuhPaar);
    
    Collection<SchuhPaar> getSchuhKollektion();
}
