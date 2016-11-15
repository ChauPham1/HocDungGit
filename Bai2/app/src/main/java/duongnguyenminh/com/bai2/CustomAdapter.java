package duongnguyenminh.com.bai2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Duong on 28/03/2016.
 */
public class CustomAdapter extends ArrayAdapter<Album> {
    Context context;
    int resource;
    List<Album> listAlbum;

    public CustomAdapter(Context context, int resource, List<Album> listAlbum) {
        super(context, resource, listAlbum);
        this.context = context;
        this.resource = resource;
        this.listAlbum = listAlbum;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowItem=inflater.inflate(resource,parent,false);

        ImageView hinhAlbum= (ImageView) rowItem.findViewById(R.id.imAlbum);
        TextView tenAlbum= (TextView) rowItem.findViewById(R.id.txtTenAlbum);
        TextView ngayPhatHang= (TextView) rowItem.findViewById(R.id.txtNgayPhatHang);

        hinhAlbum.setImageResource(listAlbum.get(position).getHinhanh());
        tenAlbum.setText(listAlbum.get(position).getTenAlbum().toString());
        ngayPhatHang.setText(listAlbum.get(position).getNgayPhatHang().toString());
        return rowItem;

    }
}
