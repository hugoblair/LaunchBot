package com.blair.launchbot;
import net.dean.jraw.RedditClient;
import net.dean.jraw.Version;
import net.dean.jraw.http.NetworkAdapter;
import net.dean.jraw.http.OkHttpNetworkAdapter;
import net.dean.jraw.http.UserAgent;
import net.dean.jraw.models.Listing;
import net.dean.jraw.models.SubredditSort;
import net.dean.jraw.models.Submission;
import net.dean.jraw.models.TimePeriod;
import net.dean.jraw.oauth.Credentials;
import net.dean.jraw.oauth.OAuthHelper;
import net.dean.jraw.pagination.DefaultPaginator;
import net.dean.jraw.pagination.Paginator;
public class Main {
    UserAgent userAgent = new UserAgent("bot", "com.blair.launchbot", "v0.1", "LaunchBot");
    //RedditClient reddit = OAuthHelper.automatic(networkAdapter, scriptOrUserlessCredentials);
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}