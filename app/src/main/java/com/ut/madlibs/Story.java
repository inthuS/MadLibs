package com.ut.madlibs;

public class Story {
    private String name; private String description;
    // stories is an array of Storys
    public static final Story[] stories = {
            new Story("Story1", "I was [verb] down the street when I saw [object].\n " +
                    "\n" +
                    ""),
            new Story("Story2", "Espresso, [adjective] milk, and a steamed milk foam"),
            new Story("President's Address","People of America, I have some [adjective] news to share. You may have noticed" +
                    " things have gotten a little [adjective] recently so I'd like to address it and discuss our next steps before things go any further.\n" +
                    "\n" +
                    "We've been invaded by [noun (plural)]. These guys are highly intelligent and highly [adjective] and it's in our best interest to cooperate. Now, I want everyone to stay" +
                    "calm, stay collected, and stay [adjective]. I've spoken with their leader and they only have a few demands. They want all of our [noun (plural)], all our [noun (plural)], and all our [noun (plural)].\n" +
                    "\n" +
                    "So, I say we give it to them."),
            new Story("Street","There I was, [verb (ending in 'ing')] home like I always do, when I saw him. It was love at first sight." +
                    "He was tall, [adjective], and handsome. And he was walking right towards me! I tried to stay [adjective]. Adjusted my [body part] and looked [adjective].\n" +
                    "\n" +
                    "As he stepped closer and closer to me it felt like there were [animal (plural)] in my [body part]. He was staring right at me, with those big, beautiful [body part (plural)].\n" +
                    "\n" +
                    "Finally, he was right in front of me. He reached out to grab my [body part]! He was going to say something to me! This was it! The beginning of out love story!\n" +
                    "\n" +
                    "'Get outta the street weirdo! You're blocking the [noun]!'\n" +
                    "\n" +
                    "\n" +
                    "...and he has a [adjective] voice too!")
    };

    //Each Story has a name, String description
    private Story(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() { return description; }

    public String getName() {return name; }

    public String toString() { return this.name; }
}
