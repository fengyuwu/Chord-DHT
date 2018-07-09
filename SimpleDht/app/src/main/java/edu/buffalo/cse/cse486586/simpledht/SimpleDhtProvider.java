//done!
//Final Version All test pass 10/10



/*
todo ===

   If it does not compile...
   Please change the classpath 'com.android.tools.build:gradle:3.0.1' to classpath 'com.android.tools.build:gradle:2.2.3' at the build:gradle file.
   feel free to email me at fengyuwu@Buffallo.edu. it works on my machine.
todo ===
 */



//Test Environment Mac OS
//build.gradle and Template code from Steve ko, it works on my end.
//I lost my original Template code copy of from git hub repo after some commit. For some reason, 3.0.1 is buggy in my end.
//If does not compile, please change the build/gradle file
//
//   classpath 'com.android.tools.build:gradle:3.0.1' to classpath 'com.android.tools.build:gradle:2.2.3'
//and let the ide fix/ sync itself.
//Thanks. feel free to email me at fengyuwu@Buffallo.edu
//https://docs.google.com/document/d/1Y24TKLiBYLHk7hKFgHy2zQJI3UTHkBbNJ7mGYkwyy6E/edit
//http://www.cse.buffalo.edu/~stevko/courses/cse486/spring17/files/SimpleDht.zip
//http://www.cse.buffalo.edu/~stevko/courses/cse486/spring17/files
//classpath 'com.android.tools.build:gradle:2.2.3'
//  compileSdkVersion 19 distributionUrl=https\://services.gradle.org/distributions/gradle-2.14.1-all.zip
// buildToolsVersion "21.1.2"
        package edu.buffalo.cse.cse486586.simpledht;
/*
10% pass!
//Intensive testing passed 10/10 Every time it runs


//UI code can not be disabled for performance
//Final Version
//UI/UN-need Exception handing codes can be comment out/delete to improve performance.

//Exception handle code, some exception is just warning from write fail and read is more important,as i need to clean the content provider and queue.
//Also used to detect failed avd / process so that it will remove bad message. (Log cat can not be deleted in order for the program to run)!

//Socket message passing code  mainly based on old PA1,PA2A and https://docs.oracle.com/javase/tutorial/networking/sockets/index.html
//https://developer.android.com/reference/java/net/Socket.html
//https://developer.android.com/reference/java/net/ServerSocket.html
//Sockets mainly based on https://docs.oracle.com/javase/tutorial/networking/sockets/examples/EchoClient.java
//Server Sockets mainly based on https://docs.oracle.com/javase/tutorial/networking/sockets/examples/EchoServer.java

//Socket message passing code mainly base on https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html
//https://docs.oracle.com/javase/7/docs/api/java/io/ObjectInputStream.html
//        https://stackoverflow.com/questions/9412040/how-to-get-column-value-from-sqlite-cursor



//URI,content provider code mainly base on PA1,PA2A.

Os error is a path problem!

source ~/.bash_profile

Then it is good

./simpledht-grading.osx /Users/dev/Desktop/SimpleDht/app/build/outputs/apk/app-debug.apk

Mar 16 9:55am pass 1%, query done,delete unimplemented. But still pass since the test did not check for delete.




Upon completing a new node join request, affected nodes should have updated their predecessor and successor pointers correctly.
1% if local insert/query/delete operations work correctly with 1 AVD. Every time it test, it start on one avd, chosen randomly.

Query is done. Need to set dir 10000 to make it to work! otherwise only pass 1 %, if setdir 3%
minSdkVersion 19
        targetSdkVersion 19

* All Source:
* https://stackoverflow.com/questions/9412040/how-to-get-column-value-from-sqlite-cursor
* https://docs.google.com/document/d/1iU2kCjM-XGsbDBRtaV24U1g10jKTe1jq5mplSK0hOtU/edit#heading=h.evov0wf199ob
 * https://developer.android.com/guide/components/activities/activity-lifecycle.html
 * https://developer.android.com/reference/android/view/View.html
 * https://developer.android.com/reference/android/text/method/MovementMethod.html
 * https://developer.android.com/reference/android/text/method/ScrollingMovementMethod.html
 * https://developer.android.com/reference/android/widget/Button.html
 * https://developer.android.com/reference/android/content/ContentResolver.html
 * https://developer.android.com/reference/android/app/Activity.html
 * https://developer.android.com/reference/android/view/View.OnClickListener.html
 * https://developer.android.com/guide/topics/ui/menus.html
 * https://developer.android.com/reference/android/view/MenuInflater.html
 * http://www.gecg.in/papers/ds5thedn.pdf
 * https://studylib.net/doc/7830646/isis-algorithm-for-total-ordering-of-messages
 * https://docs.google.com/document/d/1xgXwZ6GYA152WT3K0B1MPP7F0mf0sPCPzfqr528pO5Y/edit
 * https://www.cse.buffalo.edu/~eblanton/course/cse586/materials/2018S/12-multicast2.pdf
 * https://www.youtube.com/watch?v=yHRYetSvyjU&t=461s&list=LLDLR_M72v5WJbeR8k5Vw1Ow&index=3
 * https://www.cse.buffalo.edu/~stevko/courses/cse486/spring17/lectures/12-multicast2.pdf
 * https://developer.android.com/reference/java/io/ObjectOutputStream.html
 * https://developer.android.com/reference/java/io/ObjectInputStream.html
 * https://developer.android.com/guide/topics/ui/notifiers/toasts.html
 * Some Code From PA1 PA2A Steve's template code/hacks (Sockets, array, array list, content provider,content resolver,uri, cursor,sqlite, The book, Piaaza etc...
 * https://developer.android.com/reference/java/io/Serializable.html
 * https://developer.android.com/reference/java/util/Comparator.html
 * https://developer.android.com/reference/java/util/PriorityQueue.html
 * https://developer.android.com/reference/java/util/concurrent/PriorityBlockingQueue.html
 * https://developer.android.com/reference/java/util/Collection.html
 * https://developer.android.com/reference/java/lang/Exception.html
 * https://developer.android.com/reference/android/os/AsyncTask.html
 * https://developer.android.com/reference/java/lang/Enum.html
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
 * https://www.cse.buffalo.edu/~eblanton/course/cse586/materials/2018S/group-messenger-2.pdf
 * https://docs.google.com/document/d/1xgXwZ6GYA152WT3K0B1MPP7F0mf0sPCPzfqr528pO5Y/edit
 *
 * Version = Final!
 */


        import java.io.ObjectInputStream;
        import java.io.ObjectOutputStream;
        import java.net.InetAddress;
        import java.net.ServerSocket;
        import java.net.Socket;

        import java.security.MessageDigest;
        import java.security.NoSuchAlgorithmException;
        import java.util.ArrayList;
        import java.util.Collections;

        import java.util.Formatter;


        import android.annotation.SuppressLint;
        import android.content.ContentProvider;
        import android.content.ContentUris;
        import android.content.ContentValues;

        import android.database.Cursor;
        import android.database.MatrixCursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.net.Uri;
        import android.os.AsyncTask;
        import android.telephony.TelephonyManager;
        import android.util.Log;

        import static edu.buffalo.cse.cse486586.simpledht.Handshake.LEX;


public class SimpleDhtProvider extends ContentProvider {

    private MysqlHelper mOpenHelper;
    private int ERROR = 0;
    private int INF = 11108;
    private int INF_all = 11108;
    private int INF_del = 11108;
    int avd_id = -10000;  //AVD Identifier
    String avd_node_id = "";
    static final String REMOTE_PORT0 = "11108";//emulator-5554) receive all new node join requests.
    static final String REMOTE_PORT1 = "11112";
    static final String REMOTE_PORT2 = "11116";
    static final String REMOTE_PORT3 = "11120";
    static final String REMOTE_PORT4 = "11124";
    ArrayList<Handshake> myChordRing = new ArrayList<>();
    ArrayList<Handshake> myDHT = new ArrayList<>();

    Handshake globally_cusor;

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {

        try {
            if (!avd_node_id.equals(compar_hash(genHash(selection)))) {

                //can not delete yet, this is not the right avd.

                Log.i("MyLog", "62 delete is INFing key not gone yet" + selection);
                String a = "33d6357cfaaf0f72991b0ecd8c56da066613c089";
                String b = "208f7f72b198dadd244e61801abe1ec3a4857bc9";
                String c = "abf0fd8db03e5ecb199a9b82929e9db79b909643";
                String d = "c25ddd596aa7c81fa12378fa725f706d54325d12";
                String e = "177ccecaec32c54b82d5aaafc18a2dadb753e3b1";

                String where_to = "";
                Handshake temp_delete = new Handshake();

                if (a.equals(compar_hash(genHash(selection)))) {
                    where_to = "5554";
                } else if (b.equals(compar_hash(genHash(selection)))) {
                    where_to = "5556";
                } else if (c.equals(compar_hash(genHash(selection)))) {
                    where_to = "5558";
                } else if (d.equals(compar_hash(genHash(selection)))) {
                    where_to = "5560";
                } else if (e.equals(compar_hash(genHash(selection)))) {
                    where_to = "5562";
                }


                temp_delete.setMsgContent(where_to);//where to?
                temp_delete.setAck(8);// 8 for delete

                temp_delete.setkey(selection);//key that need to be delete
                Log.i("MyLog", "60 Redirect delete request to port " + where_to);

                new Client().executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, temp_delete);//Start a AsyncTask to handle temp_delete


                if (INF_del == 11108) {
                    do {

//Source:
//                    https://developer.android.com/reference/java/lang/Thread.html
//                    https://docs.oracle.com/javase/tutorial/essential/concurrency/sleep.html
//                    https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html
//                    https://docs.google.com/document/d/1iU2kCjM-XGsbDBRtaV24U1g10jKTe1jq5mplSK0hOtU/edit
//                    https://developer.android.com/reference/android/database/MatrixCursor.html
//                    https://stackoverflow.com/questions/46898/how-to-efficiently-iterate-over-each-entry-in-a-map?answertab=active#tab-top
//                    https://stackoverflow.com/questions/18368359/using-addrow-for-matrixcursor-how-to-add-different-object-types
                    } while (INF_del == 11108);
                }


                Log.i("MyLog", "64 delete is finish, moved on now+" + INF_del++);


            } else {
                //delete it right now, this is the right avd
                Log.i("MyLog", "61 delete completed key gone" + selection);


                String [] a7 ={selection};
                return mOpenHelper.getReadableDatabase().delete("my_table", "key = ?", a7);
            }
        } catch (Exception e) {
            ++ERROR;
        }


        return 0;


    }

    @Override
    public String getType(Uri uri) {
        //todo Good # 3
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {


        switch (myChordRing.size()){
            case 1:
                Log.i("MyLog", "19 (Inserting) only  one  AVD is active");
                Log.i("MyLog", "Error times " + ERROR);
                SQLiteDatabase db = mOpenHelper.getWritableDatabase();

                //Since I am inserting, so I need write access.

                long row_ID = db.insertWithOnConflict("my_table", null, values, 5);//android dev website
                if (row_ID == -1) {
                    //Log.i("my Provider?", "insert failed! " + " -F.W");
                    //Log.wtf("my Provider?", "The should not happen, Insert method is not good!" + "F.W.");
                    System.exit(-1);
                } else {
                    //Log.i("my Provider?", "insert success!!! " + " -F.W");
                    return ContentUris.withAppendedId(uri, row_ID);

                }

                //Log.wtf("my Provider?", "The should not happen, Insert method is not good!" + "F.W.");
                db.close();

                break;
            default:
                //more than one avd is online
                Log.i("MyLog", "Error times " + ERROR);


                try {

                    if (!compar_hash(genHash(values.getAsString("key"))).equals(avd_node_id)) { //key does not belong to this avd


                        //todo re-insert


                        String a = "33d6357cfaaf0f72991b0ecd8c56da066613c089";
                        String b = "208f7f72b198dadd244e61801abe1ec3a4857bc9";
                        String c = "abf0fd8db03e5ecb199a9b82929e9db79b909643";
                        String d = "c25ddd596aa7c81fa12378fa725f706d54325d12";
                        String e = "177ccecaec32c54b82d5aaafc18a2dadb753e3b1";

                        String where_to = "";
                        Handshake temp_re = new Handshake();

                        if (a.equals(compar_hash(genHash(values.getAsString("key"))))) {
                            where_to = "5554";
                        } else if (b.equals(compar_hash(genHash(values.getAsString("key"))))) {
                            where_to = "5556";
                        } else if (c.equals(compar_hash(genHash(values.getAsString("key"))))) {
                            where_to = "5558";
                        } else if (d.equals(compar_hash(genHash(values.getAsString("key"))))) {
                            where_to = "5560";
                        } else if (e.equals(compar_hash(genHash(values.getAsString("key"))))) {
                            where_to = "5562";
                        }

                        temp_re.setMsgContent(where_to);//where to?
                        temp_re.setAck(4);// 4 stand for reinsert.
                        temp_re.setval(values.getAsString("value")); //msg real key content
                        temp_re.setkey(values.getAsString("key"));//msg real value
                        Log.i("MyLog", "20 We are not the same!  val  " + values.getAsString("value") + " key " + values.getAsString("key"));
                        new Client().executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, temp_re);//Start a AsyncTask to handle re send


                    } else { //key belong to this avd


                        SQLiteDatabase db2 = mOpenHelper.getWritableDatabase();

                        //Since I am inserting, so I need write access.

                        long row_ID2 = db2.insertWithOnConflict("my_table", null, values, 5);//android dev website
                        if (row_ID2 == -1) {
                            //Log.i("my Provider?", "insert failed! " + " -F.W");
                            //Log.wtf("my Provider?", "The should not happen, Insert method is not good!" + "F.W.");
                            System.exit(-1);
                        } else {
                            //Log.i("my Provider?", "insert success!!! " + " -F.W");
                            return ContentUris.withAppendedId(uri, row_ID2);

                        }

                        //Log.wtf("my Provider?", "The should not happen, Insert method is not good!" + "F.W.");
                        db2.close();


                    }

                } catch (Exception eee) {
                    ++ERROR;
                }

                break;



        }



        return null; //it will never get here.
    }

    @Override
    public boolean onCreate() {
        //todo Good # 4
        //Log.i("my Provider?", "In onCreate: helper called" + "F.W.");
        //Source: PA1,PA2A,Steve's hack code

        /*
        Each content provider instance should have a node id derived from its emulator port.
        This node id should be obtained by applying the above hash function (i.e., genHash()) to the emulator port.
        For example, the node id of the content provider instance running on emulator-5554 should be, node_id = genHash(“5554”).
        This is necessary to find the correct position of each node in the Chord ring.
         */


        TelephonyManager tel = (TelephonyManager) getContext().getSystemService(this.getContext().TELEPHONY_SERVICE);
        @SuppressLint("HardwareIds") String portStr = tel.getLine1Number().substring(tel.getLine1Number().length() - 4);
        final String myPort = String.valueOf((Integer.parseInt(portStr) * 2));
        avd_id = Integer.parseInt(myPort);

        try {
            avd_node_id = genHash(get_avd_name(avd_id));
        } catch (Exception e) {

            ++ERROR;
        }

        //avd_id is in the form of 11108...11124
        //get_avd_name(avd_id) is in the form of 5554...5562
        //avd_node_id is hash of 5554...5562 and is in the form of 33d6357cfaaf0f72991b0ecd8c56da066613c089...
        Log.i("MyLog", "1 This AVD port is  " + avd_id);
        Log.i("MyLog", "2 This AVD Node ID is  " + get_avd_name(avd_id));
        Log.i("MyLog", "3 This AVD Node ID in Hash is  " + avd_node_id);
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            new Server().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, serverSocket);
        } catch (Exception e) {
            ++ERROR;

        }


        //I do node join whenever an AVD come online,So it is better to do it here, when every AVD start up, send a request to client
        //then the client send the request to 5554 server. 5554 will handle the node join.
        /*
        Your content provider do not need to handle concurrent node joins.
        You can assume that a node join will only happen once the system completely processes the previous join.
        Your content provider do not need to handle insert/query requests while a node is joining.
        You can assume that insert/query requests will be issued only with a stable system.
        Only after Node join is complete, then it will test insert and query.
         */
        Handshake temp = new Handshake();
        temp.setAck(2);//2 stand for New_Node_Join_Request.
        new Client().executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, temp);//Start a AsyncTask to handle node join request whenever an avd started.


        mOpenHelper = new MysqlHelper(getContext());//gather all information that is necessary to form the database.


        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
                        String sortOrder) {


        switch (selection) {

            case "*":
                if (myChordRing.size() != 1) {
                    Log.i("AVD ", +avd_id + " is querying * ");
                    //If * is in the selection then I will return every thing in the content provider using MySQL syntax
                    //SELECT * FROM my_table; means Select everything in the table and project them.
                    //Source :https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase.html#rawQuery(java.lang.String,%20java.lang.String[],%20android.os.CancellationSignal)

                    Handshake whole_dht = new Handshake();
                    whole_dht.setAck(6);// 6 stand for get the whole dht

                    new Client().executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, whole_dht);//Start a AsyncTask to handle temp_reQuery

                    if (INF_all == 11108) {
                        do {
//Source:
//                    https://developer.android.com/reference/java/lang/Thread.html
//                    https://docs.oracle.com/javase/tutorial/essential/concurrency/sleep.html
//                    https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html
//                    https://docs.google.com/document/d/1iU2kCjM-XGsbDBRtaV24U1g10jKTe1jq5mplSK0hOtU/edit
//                    https://developer.android.com/reference/android/database/MatrixCursor.html
//                    https://stackoverflow.com/questions/46898/how-to-efficiently-iterate-over-each-entry-in-a-map?answertab=active#tab-top
//                    https://stackoverflow.com/questions/18368359/using-addrow-for-matrixcursor-how-to-add-different-object-types
                        } while (INF_all == 11108);
                    }


                    String [] a1 ={"key", "value"};
                    MatrixCursor cus = new MatrixCursor(a1);


                    int i = 0;
                    while (i < myDHT.size()) {// 1 -5 AVD
                        int j = 0;
                        while (j < myDHT.get(i).getRING().size()) {
                            String [] a2 ={myDHT.get(i).getRING().get(j).getkey(), myDHT.get(i).getRING().get(j).getval()};

                            cus.addRow(a2);


                            j++;
                        }


                        i++;
                    }


                    Log.i("MyLog", "36 return all dht done good " + INF_all++);

                    return cus;


                } else {
                    return mOpenHelper.getReadableDatabase().rawQuery("SELECT * FROM my_table;", null);

                }



            case "@":

            /*
            If @ (not including quotes, i.e., “@” should be the string in your code) is given as the selection parameter to query() on an AVD,
            then you need to return all <key, value> pairs stored in your local partition of the node,
            i.e., all <key, value> pairs stored locally in the AVD on which you run query().

             */
                Log.i("AVD ", +avd_id + " is querying @ ");

                //Same with *, Select everything in the table and project them iff this is stored in your local partition of the node.
                //This may work with 1 avd, todo Did not check AVD ID YET, may be wrong if there is more than 1 avd.
                //todo this will not pass beyond 1 % because there are more than 1 avd in later phase

                return mOpenHelper.getReadableDatabase().rawQuery("SELECT * FROM my_table;", null);


            default:
                            /*
                            Testing mQRzsLu4jl19kqkXuJ5H8bIqCDL1pNSL xYTyQPb1Z20AXcnbW9tSKjoxFy1zzvEA
                Querying (emulator-5554) mQRzsLu4jl19kqkXuJ5H8bIqCDL1pNSL
                Key not returned: mQRzsLu4jl19kqkXuJ5H8bIqCDL1pNSL

             */
                Log.i("MyLog", "21 Query is in the from of  Selection  " + selection + "SelectionArgs  " + selectionArgs + "Projection  " + projection + "SortOrder " + sortOrder + "URI  " + uri + " " + "AVD IS " + avd_id);
                try {

                    String where_this_key_belong = compar_hash(genHash(selection));

                    Log.i("MyLog", "22 This query key should belong to    " + where_this_key_belong + "I am " + avd_node_id);

                    if (!avd_node_id.equals(where_this_key_belong)) {


                        //todo re-query


                        String a = "33d6357cfaaf0f72991b0ecd8c56da066613c089";
                        String b = "208f7f72b198dadd244e61801abe1ec3a4857bc9";
                        String c = "abf0fd8db03e5ecb199a9b82929e9db79b909643";
                        String d = "c25ddd596aa7c81fa12378fa725f706d54325d12";
                        String e = "177ccecaec32c54b82d5aaafc18a2dadb753e3b1";

                        String where_to = "";
                        Handshake temp_reQuery = new Handshake();

                        if (a.equals(compar_hash(genHash(selection)))) {
                            where_to = "5554";
                        } else if (b.equals(compar_hash(genHash(selection)))) {
                            where_to = "5556";
                        } else if (c.equals(compar_hash(genHash(selection)))) {
                            where_to = "5558";
                        } else if (d.equals(compar_hash(genHash(selection)))) {
                            where_to = "5560";
                        } else if (e.equals(compar_hash(genHash(selection)))) {
                            where_to = "5562";
                        }

                        temp_reQuery.setMsgContent(where_to);//where to?
                        temp_reQuery.setAck(5);// 5 stand for temp_reQuery.

                        temp_reQuery.setkey(selection);//msg real value
                        Log.i("MyLog", "23 Redirect query to port " + where_to);
                        new Client().executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, temp_reQuery);//Start a AsyncTask to handle temp_reQuery

                        if (INF == 11108) {
                            do {
                                //Source:
//                    https://developer.android.com/reference/java/lang/Thread.html
//                    https://docs.oracle.com/javase/tutorial/essential/concurrency/sleep.html
//                    https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html
//                    https://docs.google.com/document/d/1iU2kCjM-XGsbDBRtaV24U1g10jKTe1jq5mplSK0hOtU/edit
//                    https://developer.android.com/reference/android/database/MatrixCursor.html
//                    https://stackoverflow.com/questions/46898/how-to-efficiently-iterate-over-each-entry-in-a-map?answertab=active#tab-top
//                    https://stackoverflow.com/questions/18368359/using-addrow-for-matrixcursor-how-to-add-different-object-types

                            } while (INF == 11108);
                        }


                        Log.i("MyLog", "29 query redirect completed map is " + globally_cusor.getAck() + INF++);

//                    Log.i("MyLog", "29 query redirect completed ack is " + globally_cusor.getAck());


                        String [] a3 ={"key", "value"};
                        MatrixCursor cus = new MatrixCursor(a3);

                        String [] a4 ={globally_cusor.getkey(), globally_cusor.getval()};

                        cus.addRow(a4);
                        Log.i("MyLog", "28  return good ");


                        return cus;


                    }
                } catch (Exception e) {

                    ++ERROR;
                }

                String [] a5 ={selection};
                return mOpenHelper.getReadableDatabase().query(false, "my_table", null, "key = ?", a5, null, null, null, "1");




        }




    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        //todo Good # 5

        return 0;
    }


    //================Helper methods below================================================================================================================================================


    //Hash function to generate keys
    //takes a string and generates a SHA-1 hash as a hexadecimal string

    private String genHash(String input) throws NoSuchAlgorithmException {
        //todo Good # 6
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        byte[] sha1Hash = sha1.digest(input.getBytes());
        Formatter formatter = new Formatter();
        for (byte b : sha1Hash) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }


    //Given two keys, you can use the standard lexicographical
    //string comparison to determine which one is greater

    public int compar_keys(String x, String y) {
        //todo Good # 7


        //Return value 0 if the x is equal to this y
        //Return value less than 0 if x is lexicographically less than the y
        //Return value greater than 0 if x is lexicographically greater than the y
        //Source:https://docs.oracle.com/javase/6/docs/api/java/lang/String.html#compareTo%28java.lang.String%29
        return x.compareTo(y);
    }


    @SuppressLint("StaticFieldLeak")
    public class Server extends AsyncTask<ServerSocket, String, Void> {


        @Override
        protected Void doInBackground(ServerSocket... sockets) {
            ServerSocket serverSocket = sockets[0];


            try {
                do {
                    Socket socket = serverSocket.accept();

                    //https://developer.android.com/reference/java/io/ObjectInputStream.html
                    //https://developer.android.com/reference/java/io/ObjectOutputStream.html

                    ObjectInputStream ois;
                    ois = new ObjectInputStream(socket.getInputStream());
                    ObjectOutputStream oos;
                    oos = new ObjectOutputStream(socket.getOutputStream());
                    Handshake message_from_client; //Read message from client
                    message_from_client = (Handshake) ois.readObject();


                    switch (message_from_client.getAck()) {

                        case 2:
                            //magic number 2  is for Some one other than 5554 want to join the ring  New_Node_Join_Request;
                            Log.i("MyLog", "8 I am AVD   " + get_avd_name(avd_id));
                            Log.i("MyLog", "5 who want to join the Chord ring?  Count me in Said by AVD  + " + message_from_client.getClient_AVD_ID());

                            //todo need to implement join from 5556,5558,5560,5562 but not 5554
//                        String a = "33d6357cfaaf0f72991b0ecd8c56da066613c089";
                            String b = "208f7f72b198dadd244e61801abe1ec3a4857bc9";
                            String c = "abf0fd8db03e5ecb199a9b82929e9db79b909643";
                            String d = "c25ddd596aa7c81fa12378fa725f706d54325d12";
                            String e = "177ccecaec32c54b82d5aaafc18a2dadb753e3b1";

                            String RingAdd = "";

                            switch (message_from_client.getClient_AVD_ID()) {
                                case 11112:
                                    RingAdd = b;

                                    break;

                                case 11116:
                                    RingAdd = c;
                                    break;


                                case 11120:
                                    RingAdd = d;
                                    break;
                                case 11124:
                                    RingAdd = e;
                                    break;


                            }


                            Handshake temp = new Handshake();
                            temp.setkey(RingAdd);
                            temp.setval(String.valueOf(message_from_client.getClient_AVD_ID()));
                            myChordRing.add(temp);


                            for (int i = 0; i < myChordRing.size(); i++) {
                                Log.i("MyLog", "7 what is in the chord ring? These element  " + myChordRing.get(i).getkey() + " " + myChordRing.get(i).getval());
                            }

                            Collections.sort(myChordRing, LEX);


                            for (int i = 0; i < myChordRing.size(); i++) {
                                Log.i("MyLog", "9 what is in the chord ring after sort?? These element  " + myChordRing.get(i).getkey() + " " + myChordRing.get(i).getval() + " " + Integer.valueOf(myChordRing.get(i).getval()) / 2);
                            }


                            Handshake temp2 = new Handshake();
                            temp2.setRING(myChordRing);
                            temp2.setAck(3);//3 stand for notify the other node.

                            new Client().executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, temp2);//Start a AsyncTask to handle node join request whenever an avd started.

                            break;

                        case 3:
                            myChordRing = message_from_client.getRING();
                            Log.i("MyLog", "11 Thanks 5554 This is " + avd_id + " I am going to update my dht");

                            int i = 0;
                            while (i < myChordRing.size()) {
                                Log.i("MyLog", "12 This is  " + avd_id + " My DHT is now up to date!  " + myChordRing.get(i).getkey() + " " + myChordRing.get(i).getval() + " " + Integer.valueOf(myChordRing.get(i).getval()) / 2);
                                i++;
                            }
                            break;
                        case 4:

                            Log.i("MyLog", "999 RE ROUTE DONE " + avd_id + " I am going to update my dht");
                            ContentValues values = new ContentValues();
                            values.put("value", message_from_client.getval());//Adds a value to the set. see at class MysqlHelper.java
                            values.put("key", message_from_client.getkey()); //key and value are the column in my table.

                            SQLiteDatabase db = mOpenHelper.getWritableDatabase();

                            //Since I am inserting, so I need write access.

                            long row_ID = db.insertWithOnConflict("my_table", null, values, 5);//android dev website
                            if (row_ID != -1) {
                            } else {
                                //Log.i("my Provider?", "insert failed! " + " -F.W");
                                //Log.wtf("my Provider?", "The should not happen, Insert method is not good!" + "F.W.");
                                System.exit(-1);
                            }

                            //Log.wtf("my Provider?", "The should not happen, Insert method is not good!" + "F.W.");
                            db.close();


                            break;

                        case 5:

                            Log.i("MyLog", "26 to redirect query  request received i am" + avd_id);

                            Handshake pass_cursor = new Handshake();

                            String [] a6 ={message_from_client.getkey()};
                            Cursor cursor = mOpenHelper.getReadableDatabase().query(false, "my_table", null, "key = ?", a6, null, null, null, "1");


                            cursor.moveToLast();

                            //https://developer.android.com/reference/android/database/Cursor.html#getColumnIndex(java.lang.String)

                            pass_cursor.setval(cursor.getString(1));
                            pass_cursor.setkey(cursor.getString(0));
                            pass_cursor.setAck(9);

                            oos.writeObject(pass_cursor);
                            oos.flush();
                            break;
                        case 8:
                            String[] del_args = {message_from_client.getkey()};

                            Log.i("MyLog", "delete request got by server " + avd_id);

                            Handshake pass_cursor8 = new Handshake();

                            mOpenHelper.getReadableDatabase().delete("my_table", "key = ?", del_args);


                            pass_cursor8.setAck(9);


                            Log.i("MyLog", "delete handled by server " + avd_id);

                            oos.writeObject(pass_cursor8);
                            oos.flush();
                            break;

                        case 6:
                            Log.i("MyLog", "33 return my local dht i am avd " + avd_id);

                            Handshake pass_dht = new Handshake();


                            Cursor cursor6 = mOpenHelper.getReadableDatabase().rawQuery("SELECT * FROM my_table;", null);


                            ArrayList<Handshake> mass_query = new ArrayList<Handshake>();

                            if (!cursor6.moveToNext()) {
                            } else {
                                do {

                                    //https://developer.android.com/reference/android/database/Cursor.html#moveToNext()
                                    //https://developer.android.com/reference/android/database/Cursor.html#getColumnIndex(java.lang.String)
                                    Handshake st = new Handshake();
                                    st.setkey(cursor6.getString(0));
                                    st.setval(cursor6.getString(1));
                                    mass_query.add(st);

                                } while (cursor6.moveToNext());
                            }

                            pass_dht.setRING(mass_query);


                            oos.writeObject(pass_dht);
                            oos.flush();
                            Log.i("MyLog", "34 return my local IS DONE(SERVER) dht i am avd " + avd_id);


                            break;

                        default:

                            Log.i("MyLog", "Unhandled cases" + avd_id);

                            break;


                    }


                    socket.close();

                } while (true);


            } catch (Exception e) {
                ++ERROR;
            }
            return null;
        }
    }

    @SuppressLint("StaticFieldLeak")
    public class Client extends AsyncTask<Handshake, String, Void> {

        @Override
        protected Void doInBackground(Handshake... msgs) {
            /*
            Your content provider should handle new node joins.
            For this, you need to have the first emulator instance (i.e., emulator-5554) receive all new node join requests.
            Your implementation should not choose a random node to do that.
             */
            Handshake msg = msgs[0];

            switch (msg.getAck()) {
                case 2:
                    //if there is a node join request, do the following.
//                MyChord.put(avd_node_id,avd_id); //put 5554 in the ring.
                    Handshake temp = new Handshake();
                    temp.setval(String.valueOf(avd_id));
                    temp.setkey(avd_node_id);
                    myChordRing.add(temp);

                    if (!avd_node_id.equals("33d6357cfaaf0f72991b0ecd8c56da066613c089")) { //hash for 5554. only the others node can join 5554

                        Log.i("MyLog", "4 This is AVD  " + avd_id + " is trying to join the ring and its hash is " + avd_node_id + " I am  " + get_avd_name(avd_id));
                        try {

                            Socket socket = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), 11108); //(i.e., emulator-5554) receive all new node join requests.
                            ObjectOutputStream oos;
                            oos = new ObjectOutputStream(socket.getOutputStream());
                            Handshake New_Node_Join_Request = new Handshake(); //msg obj
                            New_Node_Join_Request.setAck((2));//2 FOR New_Node_Join_Request;
                            New_Node_Join_Request.setClient_AVD_ID(avd_id);//Msg contains sender client port
                            oos.writeObject(New_Node_Join_Request);//send out the msg
                            Log.i("MyLog", "6 This is AVD  " + avd_id + " Sent a msg to " + "11108-5554 " + " and request to join the ring (New_Node_Join_Request) ");
                            oos.flush();//Force send out the msg


                        } catch (Exception e) {
                            ++ERROR;

                        }


                    }
                    break;
                case 3:

                    //update the other nodes dht.
                    Log.i("MyLog", "10 This is 5554, I am going to update others node dht by send out msg");
                    try {

                        String destPort = "";
                        int i = 1;
                        while (i < 5) {
                            try {
                                switch (i) {
                                    case 0:
                                        destPort = REMOTE_PORT0;


                                        break;

                                    case 1:
                                        destPort = REMOTE_PORT1;


                                        break;

                                    case 2:
                                        destPort = REMOTE_PORT2;


                                        break;

                                    case 3:
                                        destPort = REMOTE_PORT3;


                                        break;

                                    case 4:
                                        destPort = REMOTE_PORT4;

                                        break;

                                }
                            } catch (Exception e) {
                                ++ERROR;
                            }

                            Socket socket = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), Integer.parseInt(destPort)); //update other AVD except 5554.
                            ObjectOutputStream oos;
                            oos = new ObjectOutputStream(socket.getOutputStream());
                            Handshake update_avd = new Handshake(); //msg obj
                            update_avd.setAck((3));//3 for update avd
                            update_avd.setRING(msg.getRING());//send out the updated dht
                            oos.writeObject(update_avd);//send out the msg
                            Log.i("MyLog", "11 This msg is going to update all node dht  " + "5554 " + " Sent a msg to " + destPort + "  ");
                            oos.flush();//Force send out the msg

                            i++;
                        }
                    } catch (Exception e) {
                        ++ERROR;

                    }


                    break;


                case 4:


                    //handle resend
                    //todo re insert
                    try {
                        Log.i("MyLog", "SHIT RE ROUTE");
                        Log.i("MyLog", "SHIT RE ROUTE to port " + Integer.parseInt(msg.getmsgContent()) * 2);
                        Log.i("MyLog", "SHIT RE ROUTE val " + msg.getval());
                        Log.i("MyLog", "SHIT RE ROUTE key " + msg.getkey());

                        Socket socket = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), Integer.parseInt(msg.getmsgContent()) * 2); //update other AVD except 5554.
                        ObjectOutputStream oos;
                        oos = new ObjectOutputStream(socket.getOutputStream());
                        Handshake resend_msg = new Handshake(); //msg obj
                        resend_msg.setAck((4));//4 for re send msg
                        resend_msg.setval(msg.getval());
                        resend_msg.setkey(msg.getkey());


                        oos.writeObject(resend_msg);//send out the msg


                        oos.flush();//Force send out the msg


                    } catch (Exception eee) {
                        ++ERROR;
                    }

                    break;

                case 8:


                    // todo handle delete

                    try {


                        Socket socket = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), Integer.parseInt(msg.getmsgContent()) * 2); //update other AVD except 5554.
                        ObjectOutputStream oos;
                        oos = new ObjectOutputStream(socket.getOutputStream());
                        Handshake resend_msg = new Handshake(); //msg obj
                        resend_msg.setAck((8));

                        resend_msg.setkey(msg.getkey());


                        oos.writeObject(resend_msg);//send out the msg

                        oos.flush();//Force send out the msg


                        ObjectInputStream ois;
                        ois = new ObjectInputStream(socket.getInputStream());
                        Handshake get_back_cusor;
                        get_back_cusor = (Handshake) ois.readObject();

                        if (get_back_cusor.getAck() == 9) {


                            Log.i("MyLog", "delete completed" + avd_id + "Error ") ;

                            INF_del = 11107;

                        }


                    } catch (Exception eee) {
                        ++ERROR;
                    }

                    break;



                case 5:
                    //todo re query
                    try {
                        Log.i("MyLog", "SHIT RE query");

                        Log.i("MyLog", "SHIT RE query to port " + Integer.parseInt(msg.getmsgContent()) * 2);
//                    Log.i("MyLog", "SHIT RE query val " + msg.getval());
                        Log.i("MyLog", "SHIT RE query key " + msg.getkey());

                        Socket socket = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), Integer.parseInt(msg.getmsgContent()) * 2); //update other AVD except 5554.
                        ObjectOutputStream oos;
                        oos = new ObjectOutputStream(socket.getOutputStream());
                        Handshake resend_msg = new Handshake(); //msg obj
                        resend_msg.setAck((5));//5 for re query msg

                        resend_msg.setkey(msg.getkey());


                        oos.writeObject(resend_msg);//send out the msg

                        oos.flush();//Force send out the msg


                        ObjectInputStream ois;
                        ois = new ObjectInputStream(socket.getInputStream());
                        Handshake get_back_cusor;
                        get_back_cusor = (Handshake) ois.readObject();
                        globally_cusor = get_back_cusor;
                        Log.i("MyLog", "24 Redirect query success i am " + avd_id);

//                    Log.i("MyLog", "25 Redirect query success i am " + avd_id + "checking map content " + globally_cusor.get_map());

                        if (get_back_cusor.getAck() == 9) {


                            Log.i("MyLog", "query completed" + avd_id);

                            INF = 11107;

                        }

                    } catch (Exception eee) {
                        ++ERROR;

                    }
                    break;

                case 6:

                    try {
                        Log.i("MyLog", "40  dht query all is sent to server by  " + avd_id);

                        Socket socket = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), 11108); //update other AVD except 5554.
                        ObjectOutputStream oos;
                        oos = new ObjectOutputStream(socket.getOutputStream());
                        Handshake resend_msg = new Handshake(); //msg obj
                        resend_msg.setAck((6));//6 for get dht
                        resend_msg.setkey(msg.getkey());
                        oos.writeObject(resend_msg);//send out the msg
                        oos.flush();//Force send out the msg

                        ObjectInputStream ois;
                        ois = new ObjectInputStream(socket.getInputStream());
                        Handshake get_back_cusor;
                        get_back_cusor = (Handshake) ois.readObject();
                        myDHT.add(get_back_cusor);
                        Log.i("MyLog", "41  got dht back from 11108 i am  " + avd_id);


                    } catch (Exception eee) {
                        ++ERROR;

                    }

                    try {
                        Log.i("MyLog", "40  dht query all is sent to server by  " + avd_id);

                        Socket socket = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), 11112); //update other AVD except 5554.
                        ObjectOutputStream oos;
                        oos = new ObjectOutputStream(socket.getOutputStream());
                        Handshake resend_msg = new Handshake(); //msg obj
                        resend_msg.setAck((6));//6 for get dht
                        resend_msg.setkey(msg.getkey());
                        oos.writeObject(resend_msg);//send out the msg
                        oos.flush();//Force send out the msg

                        ObjectInputStream ois;
                        ois = new ObjectInputStream(socket.getInputStream());
                        Handshake get_back_cusor;
                        get_back_cusor = (Handshake) ois.readObject();
                        myDHT.add(get_back_cusor);
                        Log.i("MyLog", "41  got dht back from 11112 i am  " + avd_id);


                    } catch (Exception eee) {
                        ++ERROR;
                    }

                    try {
                        Log.i("MyLog", "40  dht query all is sent to server by  " + avd_id);

                        Socket socket = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), 11116); //update other AVD except 5554.
                        ObjectOutputStream oos;
                        oos = new ObjectOutputStream(socket.getOutputStream());
                        Handshake resend_msg = new Handshake(); //msg obj
                        resend_msg.setAck((6));//6 for get dht
                        resend_msg.setkey(msg.getkey());
                        oos.writeObject(resend_msg);//send out the msg
                        oos.flush();//Force send out the msg

                        ObjectInputStream ois;
                        ois = new ObjectInputStream(socket.getInputStream());
                        Handshake get_back_cusor;
                        get_back_cusor = (Handshake) ois.readObject();
                        myDHT.add(get_back_cusor);
                        Log.i("MyLog", "41  got dht back from 11116 i am  " + avd_id);


                    } catch (Exception eee) {
                        ++ERROR;
                    }

                    try {
                        Log.i("MyLog", "40  dht query all is sent to server by  " + avd_id);

                        Socket socket = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), 11120); //update other AVD except 5554.
                        ObjectOutputStream oos;
                        oos = new ObjectOutputStream(socket.getOutputStream());
                        Handshake resend_msg = new Handshake(); //msg obj
                        resend_msg.setAck((6));//6 for get dht
                        resend_msg.setkey(msg.getkey());
                        oos.writeObject(resend_msg);//send out the msg
                        oos.flush();//Force send out the msg

                        ObjectInputStream ois;
                        ois = new ObjectInputStream(socket.getInputStream());
                        Handshake get_back_cusor;
                        get_back_cusor = (Handshake) ois.readObject();
                        myDHT.add(get_back_cusor);
                        Log.i("MyLog", "41  got dht back from 11120 i am  " + avd_id);


                    } catch (Exception eee) {
                        ++ERROR;
                    }

                    try {
                        Log.i("MyLog", "40  dht query all is sent to server by  " + avd_id);

                        Socket socket = new Socket(InetAddress.getByAddress(new byte[]{10, 0, 2, 2}), 11124); //update other AVD except 5554.
                        ObjectOutputStream oos;
                        oos = new ObjectOutputStream(socket.getOutputStream());
                        Handshake resend_msg = new Handshake(); //msg obj
                        resend_msg.setAck((6));//6 for get dht
                        resend_msg.setkey(msg.getkey());
                        oos.writeObject(resend_msg);//send out the msg
                        oos.flush();//Force send out the msg

                        ObjectInputStream ois;
                        ois = new ObjectInputStream(socket.getInputStream());
                        Handshake get_back_cusor;
                        get_back_cusor = (Handshake) ois.readObject();
                        myDHT.add(get_back_cusor);
                        Log.i("MyLog", "41  got dht back from 11124 i am  " + avd_id);


                    } catch (Exception eee) {
                        ++ERROR;
                    }


                    INF_all = 11107;
                    break;

                default:

                    Log.i("MyLog", "Unhandled cases" + avd_id);


                    break;


            }


            return null;
        }

    }

    public String compar_hash(String hashcode) {
        //todo Good # 1

        if (compar_keys(hashcode, myChordRing.get(myChordRing.size() - 1).getkey()) > 0) {

            Log.i("MyLog", "SHIT this should return 177ccecaec32c54b82d5aaafc18a2dadb753e3b111124 check now " + myChordRing.get(0).getkey());
            return myChordRing.get(0).getkey();
        } else if (compar_keys(hashcode, myChordRing.get(myChordRing.size() - 1).getkey()) == 0) {
            Log.i("MyLog", "SHIT the hash is the same " + myChordRing.get(0).getkey());
            return myChordRing.get(myChordRing.size() - 1).getkey();
        } else {

            for (int i = 0; i < myChordRing.size(); i++) {
                Log.i("MyLog", "SHIT BEFORE insert crap " + myChordRing.get(i).getkey() + myChordRing.get(i).getval());
            }
            Handshake wtf = new Handshake();
            wtf.setkey(hashcode); //hack to get the right position in the ring.
            wtf.setval("177ccecaec32c54b82d5aaafc18a2dadb753e3b111124");//Dummy
            myChordRing.add(wtf);
            Collections.sort(myChordRing, LEX);//sort it

            for (int i = 0; i < myChordRing.size(); i++) {
                Log.i("MyLog", "SHIT after insert crap " + myChordRing.get(i).getkey() + myChordRing.get(i).getval());
            }


            int crap_loc = myChordRing.indexOf(wtf);
            int crap_belong_to_index = crap_loc + 1;
            String crap_belong_to_ = myChordRing.get(crap_belong_to_index).getkey();


            myChordRing.remove(wtf);
            for (int i = 0; i < myChordRing.size(); i++) {
                Log.i("MyLog", "SHIT after remove crap " + myChordRing.get(i).getkey() + myChordRing.get(i).getval());
            }


            Log.i("MyLog", " now I know that new hash key belong to " + crap_belong_to_ + "hash code is  " + hashcode);

            return crap_belong_to_;

        }
    }


    public String get_avd_name(int temp) {
        //todo Good # 2

        String AVD_who;
        switch (temp) {
            case 11108:
                AVD_who = "5554";


                break;

            case 11112:
                AVD_who = "5556";


                break;

            case 11116:
                AVD_who = "5558";


                break;

            case 11120:
                AVD_who = "5560";


                break;

            case 11124:
                AVD_who = "5562";


                break;
            default:

                AVD_who = "6666";
                break;

        }

        //Return 5554 if this is AVD0 with port 11108
        //Return 5556 if this is AVD1 with port 11112
        //Return 5558 if this is AVD2 with port 11116
        //Return 5556 if this is AVD3 with port 11120
        //Return 5562 if this is AVD4 with port 11124
        return AVD_who;
    }


}






