package search;

import org.testng.annotations.Test;
import base.BaseTests;
import page.Search;
import static org.testng.Assert.assertEquals;

public class SearchTests extends BaseTests{

    @Test
    public void Searcher(){
        Search searchPage = homePage.clickSearch();
        searchPage.inputIn("կայքերի ստեղծում");
        searchPage.clickSearch();
        assertEquals(searchPage.result(), "Էջում ցուցադրված է : 4");
    }

    @Test
    public void EmptyCheck(){
        Search searchPage = homePage.clickSearch();
        searchPage.clickSearch();
        assertEquals(searchPage.getURL(), "https://dreamslab.am/");
    }

    @Test
    public void VisibleCheck(){
        Search searchPage = homePage.clickSearch();
        assertEquals(true, searchPage.visible());
        searchPage.clickSearch();
    }
}
