package sergioandrade.blackjack.database;

import android.provider.BaseColumns;

public final class DatabaseContract {

    private DatabaseContract() {}

    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "History";
        public static final String COLUMN_NAME_TITLE = "Nickname";
        //public static final String COLUMN_NAME_SUBTITLE = "Wins";
        public static final String USER_COL_WIN = "Win";
        public static final String USER_COL_LOSE = "Lose";
    }
}