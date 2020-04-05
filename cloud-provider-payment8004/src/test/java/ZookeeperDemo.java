import org.apache.zookeeper.*;

/**
 * @Author:Hongjie Ding
 * @Description:
 * @Date:Created in 2020/4/2 10:05
 * @Modified By:
 */
public class ZookeeperDemo {
    private static final int SESSION_TIMEOUT = 3000;
    public static void main(String[] args) {
        try {
            ZooKeeper zooKeeper = new ZooKeeper("192.168.211.1:2183", SESSION_TIMEOUT, new Watcher() {
                @Override
                public void process(WatchedEvent event) {
                    System.out.println("触发事件：" + event.getType());
                }
            });
            zooKeeper.create("/node_xbq", "coder".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            System.out.println(new String(zooKeeper.getData("/node_xbq", true, null)));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
