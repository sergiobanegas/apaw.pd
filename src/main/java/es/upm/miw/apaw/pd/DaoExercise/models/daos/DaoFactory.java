package es.upm.miw.apaw.pd.DaoExercise.models.daos;

public abstract class DaoFactory {

    public static DaoFactory factory = null;

    public static void setFactory(DaoFactory factory) {
        DaoFactory.factory = factory;
    }

    public static DaoFactory getFactory() {
        assert factory != null;
        return factory;
    }

    public abstract AuthorDao getAuthorDao();

    public abstract BookDao getBookDao();

    public abstract ContactDao getContactDao();

    public abstract StyleDao getStyleDao();

    public abstract ThemeDao getThemeDao();

}
