module kalaazu.persistence {
    exports com.kalaazu.persistence;

    requires kalaazu.utils;
    requires vertx.core;
    requires java.sql;
    requires lombok;
    requires org.jooq;
    requires java.compiler;
}