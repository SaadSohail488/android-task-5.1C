package com.example.task51c;

import java.util.ArrayList;

public class DataList {
    private ArrayList<NewsModel> list;

    public DataList() {
        // Initialize the ArrayList and add NewsModel objects to it
        list = new ArrayList<>();
        list.add(new NewsModel(0, R.drawable.n1, "PM invites William and Catherine Down Under", "A royal tour of Australia by the Prince and Princess of Wales has been in the planning for years, but has been repeatedly delayed."));
        list.add(new NewsModel(1, R.drawable.n2, "Sheeran didn’t steal from Marvin Gaye song, jury finds", "Sheeran didn’t steal from Marvin Gaye song, jury finds"));
        list.add(new NewsModel(2, R.drawable.n3, "‘White hands’ $12K bribe alleged", "Paul Andy has allegedly been offered $12,000 to recant on his claims that white artists had painted on the canvases of Aboriginal artists in the APY Arts Centre Collective’s studios."));
        list.add(new NewsModel(3, R.drawable.n4, "Chefs v artisans: what the best new bakeries reveal about us", "A ‘treat yourself’ culture is driving an explosion in bakeries, patisseries and cake shops, and with it a new type of entrepreneur is ripping up the old recipe for success."));
        list.add(new NewsModel(4, R.drawable.n5, "Making music as a first language", "Composer Deborah Cheetham Fraillon gives dignity to both sides of her musical inheritance by bringing Western and Indigenous traditions together."));
        list.add(new NewsModel(5, R.drawable.n6, "How Pete Davidson processes losing his dad in 9/11", "The comedian is more famous for his romances with Ariana Grande and Kim Kardashian, but in his new show explores a past tragedy."));
        list.add(new NewsModel(6, R.drawable.n7, "ABC host Stan Grant joins King’s coronation line-up", "Stan Grant will appear in the ABC’s coronation coverage despite revealing he felt ‘betrayed’ by his employer and colleagues following Queen Elizabeth’s death."));
        list.add(new NewsModel(7, R.drawable.n8, "Struggling students to get free tutoring", "Free tutoring at school for students struggling in maths and English has won support from federal Education Minister Jason Clare."));
        list.add(new NewsModel(8, R.drawable.n9, "Aussie earl ‘could claim the throne’", "The coronation will be a big day for Australian earl Simon Abney-Hastings, but some historians say he should be on the throne instead of Charles."));
        list.add(new NewsModel(9, R.drawable.n10, "Russian ships snapped at Nord Stream site days before blast", "Danish military photographs add new mystery to probe into who attacked pipeline."));
        list.add(new NewsModel(10, R.drawable.n11, "Australian designers reveal their most stylish stays abroad", "From the Pink City to the City of Light, the destinations favoured by our biggest names in fashion are endlessly illuminating."));
        list.add(new NewsModel(11, R.drawable.n12, "The 10 best rail journeys to take this year", "From high-speed adventures to slow and scenic experiences, there’s a track to suit every traveller."));
        list.add(new NewsModel(12, R.drawable.n13, "Cruise ship suites that resemble posh penthouses", "Your floating penthouse awaits with these exclusive at-sea addresses. Here is how seven leading cruise companies deck out their splashiest cabins."));
        list.add(new NewsModel(13, R.drawable.n14, "Climate changes role of our police in region", "There’s likely to be increases in rates of crime in a variety of ways, such as ‘survival crimes’ caused by loss of livelihoods."));
        list.add(new NewsModel(14, R.drawable.n15, "Epstein’s movie nights with Woody, dinner with Treasury chief", "New details have revealed the nature and frequency of Jeffrey Epstein’s contacts with an array of powerful people long after he was a registered sex offender."));
        list.add(new NewsModel(15, R.drawable.n16, "Buckley declared ‘perfect’ to spearhead Tassie team", "Nathan Buckley has been declared the “perfect” man to be the inaugural coach of Tasmania as a former expansion club recruit warned of the pitfalls the AFL’s 19th team must avoid. SUBSCRIBE for the full story."));
        list.add(new NewsModel(16, R.drawable.n17, "How to have a coronation watch party", "The global broadcast of King Charles III’s coronation is expected to attract hundreds of millions of viewers worldwide. For those tuning in from Australia, here is what you need to know."));
        list.add(new NewsModel(17, R.drawable.n18, "What’s it like being married to this man?", "The lawyer wife of the WikiLeaks founder is focused on securing his release and starting a ‘life in the countryside’ with their two children. Can she do it?"));
        list.add(new NewsModel(18, R.drawable.n19, "McLaren hybrid part of a golden age of motoring", "The Artura combines the tech of today and tomorrow into a potent package of violent speed. It feels like it will be too insane to drive on public roads | WATCH THE VIDEO"));
    }

    // Method to retrieve the ArrayList of NewsModel objects
    public ArrayList<NewsModel> getList() {
        return list;
    }
}
