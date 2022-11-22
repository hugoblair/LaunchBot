package com.blair.launchbot;
import net.dean.jraw.RedditClient;
import net.dean.jraw.Version;
import net.dean.jraw.http.NetworkAdapter;
import net.dean.jraw.http.OkHttpNetworkAdapter;
import net.dean.jraw.http.UserAgent;
import net.dean.jraw.models.*;
import net.dean.jraw.oauth.Credentials;
import net.dean.jraw.oauth.OAuthHelper;
import net.dean.jraw.pagination.BarebonesPaginator;
import net.dean.jraw.pagination.DefaultPaginator;
import net.dean.jraw.pagination.Paginator;
import net.dean.jraw.references.SubredditReference;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){

        UserAgent userAgent = new UserAgent("bot", "com.blair.launchbot", "v0.1", "LaunchBot");
        //RedditClient reddit = OAuthHelper.automatic(networkAdapter, scriptOrUserlessCredentials);

        // Create our credentials
        Credentials credentials = Credentials.script("LaunchBot", "reHug0rosa",
                "2qYkmqxUOTiRi_biL1wmyA", "NQaMTaKdD78EHQevzB-UIGrEtNV0Kw");

        // This is what really sends HTTP requests
        NetworkAdapter adapter = new OkHttpNetworkAdapter(userAgent);

        // Authenticate and get a RedditClient instance
        RedditClient reddit = OAuthHelper.automatic(adapter, credentials);
        SubredditReference subreddit = reddit.subreddit("rocketLeague");

        // BarebonesPaginator<Comment> paginator = reddit.latestComments(subreddit.toString()).build();
        DefaultPaginator<Submission> paginator = reddit.subreddits("Rocketleb", "rkwb").posts().timePeriod(TimePeriod.DAY).build();

    }







}
