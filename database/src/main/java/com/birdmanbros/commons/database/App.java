package com.birdmanbros.commons.database;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try(RedisDB redisdb = new RedisDB()){
    		redisdb.set("utaka", "daishi");
    	}
    }
}
