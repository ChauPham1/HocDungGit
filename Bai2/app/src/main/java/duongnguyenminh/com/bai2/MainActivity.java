package duongnguyenminh.com.bai2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    int hinhAlbum[]={R.drawable.hongocha,R.drawable.lequyen,R.drawable.noo,R.drawable.quangle,R.drawable.thanhthao};
    String tenAlbum[]={"Anh yêu em","Ang ghét làm bạn em","Chuyện chúng mình","Đồi thông hai mộ","Một nhà"};
    String ngayPhatHanh[]={"01/04/1995","01/09/1995","01/06/1995","28/04/1995","01/06/1995"};
    List<Album> albums;
    Album seleted;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv= (ListView) findViewById(R.id.listview);
        albums=new ArrayList<Album>();
        for(int i=0;i<tenAlbum.length;i++){
            Album album=new Album(hinhAlbum[i],tenAlbum[i],ngayPhatHanh[i]);
            albums.add(album);
        }
        CustomAdapter adapter=new
                CustomAdapter(this,R.layout.customlistview,albums);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                seleted= albums.get(position);
                return false;
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)menuInfo;
        menu.setHeaderTitle(seleted.getTenAlbum());
        menu.add(Menu.NONE,1,Menu.NONE,"Open this file");
        menu.add(Menu.NONE,2,Menu.NONE,"Add to favorites");
        menu.add(Menu.NONE,3,Menu.NONE,"Copy a link to this file");
        menu.add(Menu.NONE,4,Menu.NONE,"Send a link to this file");
    }
}
