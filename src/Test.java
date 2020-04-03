import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;

public class Test extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent service = new Intent("");


        ServiceConnection conn = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {

            }

            @Override
            public void onServiceDisconnected(ComponentName name) {

            }
        };


        bindService(service , conn , 1);


    }
}
