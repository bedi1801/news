package com.example.dashmesh.news;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.suredigit.inappfeedback.FeedbackDialog;

import java.util.ArrayList;

import io.doorbell.android.Doorbell;

public class Grid_ent extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private GridViewAdapter mAdapter;
    private ArrayList<String> list;
    private ArrayList<String> image;
    private FeedbackDialog feedBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_ent);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        feedBack = new FeedbackDialog(this, "AF-7A87FD4730F8-66");
        prepareList();
        mAdapter = new GridViewAdapter(this,list, image);

        // Set custom adapter to gridview
        GridView gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);

        // Implement On Item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                if (position ==0) {
                    String link="http://indianexpress.com/section/entertainment/feed/";
                    String title="Entertainment";
                    Intent intent = new Intent(Grid_ent.this, MainActivity.class);
                    intent.putExtra("link",link);
                    intent.putExtra("title",title);
                    String feed_text="INDIANEXPRESS.COM";
                    String feed_link="https://pbs.twimg.com/profile_images/1850193578/IE_Square_Logo.png";
                    intent.putExtra("feed_text",feed_text);
                    intent.putExtra("feed_link",feed_link);
                    startActivity(intent);
                }if (position ==1) {
                    String link="http://indianexpress.com/section/entertainment/bollywood/feed/";
                    String title="Bollywood";
                    Intent intent = new Intent(Grid_ent.this, MainActivity.class);
                    intent.putExtra("link",link);
                    intent.putExtra("title",title);
                    String feed_text="INDIANEXPRESS.COM";
                    String feed_link="https://pbs.twimg.com/profile_images/1850193578/IE_Square_Logo.png";
                    intent.putExtra("feed_text",feed_text);
                    intent.putExtra("feed_link",feed_link);
                    startActivity(intent);
                }if (position ==2) {
                    String link="http://indianexpress.com/section/entertainment/hollywood/feed/";
                    String title="Hollywood";
                    Intent intent = new Intent(Grid_ent.this, MainActivity.class);
                    intent.putExtra("link",link);
                    intent.putExtra("title",title);
                    String feed_text="INDIANEXPRESS.COM";
                    String feed_link="https://pbs.twimg.com/profile_images/1850193578/IE_Square_Logo.png";
                    intent.putExtra("feed_text",feed_text);
                    intent.putExtra("feed_link",feed_link);
                    startActivity(intent);
                }if (position ==3) {
                    String link="http://indianexpress.com/section/entertainment/movie-review/feed/";
                    String title="Movie Review";
                    Intent intent = new Intent(Grid_ent.this, MainActivity.class);
                    intent.putExtra("link",link);
                    intent.putExtra("title",title);
                    String feed_text="INDIANEXPRESS.COM";
                    String feed_link="https://pbs.twimg.com/profile_images/1850193578/IE_Square_Logo.png";
                    intent.putExtra("feed_text",feed_text);
                    intent.putExtra("feed_link",feed_link);
                    startActivity(intent);
                }/*if (position ==4) {
                    String link="http://indianexpress.com/print/reviews-music/feed/";
                    String title="Music Review";
                    Intent intent = new Intent(Grid_ent.this, MainActivity.class);
                    intent.putExtra("link",link);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }*/if (position ==4) {
                    String link="http://feeds.bbci.co.uk/news/entertainment_and_arts/rss.xml";
                    String title="Ent & Art";
                    Intent intent = new Intent(Grid_ent.this, MainActivity.class);
                    intent.putExtra("link",link);
                    intent.putExtra("title",title);
                    String feed_text="BBC News";
                    String feed_link="https://pbs.twimg.com/profile_images/662708106/bbc.png";
                    intent.putExtra("feed_text",feed_text);
                    intent.putExtra("feed_link",feed_link);
                    startActivity(intent);
                }
                /*if (position ==6) {
                    String link="http://dvd.netflix.com/Top25RSS?gid=2197";
                    String title="Netflix TV Top 25";
                    Intent intent = new Intent(Grid_ent.this, MainActivity_d.class);
                    intent.putExtra("link",link);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }if (position ==7) {
                    String link="http://dvd.netflix.com/NewReleasesRSS";
                    String title="Netflix New";
                    Intent intent = new Intent(Grid_ent.this, MainActivity_d.class);
                    intent.putExtra("link",link);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
            */

                Toast.makeText(Grid_ent.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void prepareList()
    {
        list = new ArrayList<String>();
        list.add("Entertainment");
        list.add("Bollywood");
        list.add("Hollywood");
        list.add("Movie Review");
        list.add("Ent. & Art");
        image = new ArrayList<String>();
        image.add("http://media.creativebloq.futurecdn.net/sites/creativebloq.com/files/images/2013/03/daftpunkicon.jpg");
        image.add("http://thrivalroom.com/wp-content/uploads/2014/05/bollywood-logo.jpg");
        image.add("https://lh4.googleusercontent.com/-mq2O5I91OLA/TXqDa9Eql7I/AAAAAAAAK4Y/t3GxPnZJ0g8/s1600/hollywood_logo3.jpg");
        image.add("http://i0.wp.com/www.54daysthemovie.com/wp-content/uploads/2014/09/movie-review.jpg");
        image.add("http://blogs.uoregon.edu/janieb/files/2014/05/95578-wq0w78.jpg");
  }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if(id== R.id.start_page){

            Intent i=new Intent(Grid_ent.this,StartActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(i);
        }else if (id == R.id.inter) {
            Intent intent = new Intent(Grid_ent.this,Grid_int.class);
            startActivity(intent);
        }else if (id == R.id.sports) {
            Intent intent = new Intent(Grid_ent.this,Grid_sports.class);
            startActivity(intent);
        } else if (id == R.id.tech) {
            Intent intent = new Intent(Grid_ent.this,Grid_Tech.class);
            startActivity(intent);
        }
        else if (id == R.id.ent) {
            Intent intent = new Intent(Grid_ent.this, Grid_ent.class);
            startActivity(intent);
        }else if (id == R.id.life) {
            Intent intent = new Intent(Grid_ent.this, Grid_life.class);
            startActivity(intent);
        }else if (id == R.id.other) {
            Intent intent = new Intent(Grid_ent.this, Grid_other.class);
            startActivity(intent);
        }
        else if (id == R.id.rate_us) {
            final Uri marketUri = Uri.parse("market://details?id=" + "com.example.dashmesh.news");
            startActivity(new Intent(Intent.ACTION_VIEW, marketUri));

        } else if (id == R.id.about_us) {

            Intent intent = new Intent(Grid_ent.this,FaqActivity.class);
            startActivity(intent);

        } else if (id == R.id.feedback) {

            new Doorbell(this, 3938, "nOnmWddPUW9PUgTXafNuZoveYas6OlpkqzT1eqyIAc7CWuWOXTvs68mM1LwxjrvU").show();

        } else if (id == R.id.share_app) {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String link = "This is a great news reader app Try this";
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
            //sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            link =link + "app_link";
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, link);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
