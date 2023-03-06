import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Connection {

  private PropertyChangeSupport support = new PropertyChangeSupport(this);

  private String status = "";

  public void addPropertyListener(PropertyChangeListener listener) {
    support.addPropertyChangeListener(listener);
  }

  public void setStatus(String status) {
    support.firePropertyChange("Status", this.status, status);
    this.status = status;
  }

}
