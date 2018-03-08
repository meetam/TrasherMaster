package com.example.nidhivellanki.trasher;

public class Trash {

    int _trash, _classification;

    public Trash(int trash, int classification)
    {
        /* Constructor for trash object. Passes a number from 0 - 7
         * (0 = apple, 1 = banana peel, 2 = aluminum can, 3 = newspaper, 4 = water bottle,
         * 5 = battery, 6 = trash bag, 7 = bag of chips) and it's classification
         * (compost(1), recyclable(2), trash(3)).
        */

        _trash = trash;
        _classification = classification;
    }

    //getters
    public int getTrash()
    {
        return _trash;
    }

    public int getClassification()
    {
        return _classification;
    }
}
