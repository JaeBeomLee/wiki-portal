/*
package lee.jaebeom.WikiPortal.main;

import java.io.Serializable;

import lee.jaebeom.WikiPortal.wiki.WikiData;

public class MainTabPresenter implements MainContract.TabPresenter, Serializable {
    String HTML;
    private final MainContract.TabView tabView;

    public MainTabPresenter(MainContract.TabView tabView) {
        this.tabView = tabView;
        this.tabView._presenter(this);
    }

    @Override
    public void CallBack() {
        tabView.CallBack();
    }

    @Override
    public void start() {

    }

    @Override
    public void saveHTML(String Html) {
        HTML = Html;
    }

    @Override
    public String getHTML() {
        return HTML;
    }

    @Override
    public String getWikiURL(String wiki){
        return WikiData.wikiURL.get(wiki).getURL();
    }

    @Override
    public String getWikiFrontURL(String wiki) {
        return WikiData.wikiURL.get(wiki).getFrontURL();
    }
}

*/