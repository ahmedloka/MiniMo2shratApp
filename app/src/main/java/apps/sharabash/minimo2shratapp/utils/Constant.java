package apps.sharabash.minimo2shratapp.utils;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

public class Constant {


    public static final String TOKEN = "Br6fOnZ8AaV-tCOdgQ28BczuZV7BIPiqpyVwP_5FdAAznSAJkj1jHDYuDWO8CvTzwgKYtwtDAAWdPZY2NlSsFz-W2muF6O91emwKkcBp7gIfwsd3RNAHno-s8AVfkZvIqbOJA0X7IMYoKVhD0wS04CzhwVEg2V98jDNSupWSAocsASSS8TD-_7ONM29aihDtkXSvTWCIIOIAE3ifwMunsj1rWal0wBdLDz5t32W74kDYUQBEVWptBRLmKjgIEHqDOSV8H_iQfoAlicsDCBp4FPDu9LsgcU7vLjdeKbXBanbVW1-2SDiStlRvnV8ZXy1bJPMbP86MBZepPN-SHoXNAZFmBQX3NxUSa_7N2M9t96mk6x4fnylpHFzD6KiU6dp_m5KIZNB6SJHrg5mO-wNdSHdJ3uN31XLkZDwc3bSs5dA9QouXA-tsGxp9P97cxxahDMbcBjQN4SsOyj0Zr5BKzbtXwqpXJ4gtf45maMSCV86wUF1si2gbK84O-jP3kzrw";

    public static final String BASE_URL_HTTP = "http://pixelserver-001-site51.ctempurl.com/";

    public static void hideStatusBar(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = activity.getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }
}
