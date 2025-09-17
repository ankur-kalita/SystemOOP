package proxy_pattern.virtual_proxy;

public interface Icon {
    int getIconWidth();
    int getIconHeight();
    void paintIcon(Component c, Graphics g, int x, int y);
}
