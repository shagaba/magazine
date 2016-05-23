package com.shagaba.magazine.domain.audit;

import java.time.LocalDateTime;

public interface Auditable {

    /**
     * @return the version
     */
    public long getVersion();

    /**
     * @param version the version to set
     */
    public void setVersion(long version);

    /**
     * @return the createdBy
     */
    public String getCreatedBy();

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy);

    /**
     * @return the createdTime
     */
    public LocalDateTime getCreatedTime();

    /**
     * @param createdTime the createdTime to set
     */
    public void setCreatedTime(LocalDateTime createdTime);

    /**
     * @return the lastModifiedBy
     */
    public String getLastModifiedBy();

    /**
     * @param lastModifiedBy the lastModifiedBy to set
     */
    public void setLastModifiedBy(String lastModifiedBy);

    /**
     * @return the lastModifiedTime
     */
    public LocalDateTime getLastModifiedTime();

    /**
     * @param lastModifiedTime the lastModifiedTime to set
     */
    public void setLastModifiedTime(LocalDateTime lastModifiedTime);
    
}
