package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnDblogXtp {
    private String currentLsn;

    private String operation;

    private String context;

    private String transactionId;

    private Long logblockgeneration;

    private Short logRecordFixedLength;

    private Short logRecordLength;

    private String previousLsn;

    private Integer logReserve;

    private Long allocunitid;

    private String allocunitname;

    private String pageId;

    private Integer slotId;

    private String previousPageLsn;

    private Long partitionid;

    private Short rowflags;

    private Short numElements;

    private Short offsetInRow;

    private Short modifySize;

    private String checkpointBegin;

    private Short chkptBeginDbVersion;

    private String maxXdesid;

    private Short numTransactions;

    private String checkpointEnd;

    private Short chkptEndDbVersion;

    private String minimumLsn;

    private Integer dirtyPages;

    private String oldestReplicatedBeginLsn;

    private String nextReplicatedEndLsn;

    private String lastDistributedBackupEndLsn;

    private String lastDistributedEndLsn;

    private String replMinHoldLsn;

    private Integer serverUid;

    private Integer spid;

    private Integer xactType;

    private String beginTime;

    private String transactionName;

    private String parentTransactionId;

    private String oldestActiveTransactionId;

    private Long xactId;

    private Integer xactNodeId;

    private Integer xactNodeLocalId;

    private Long endAge;

    private String endTime;

    private String transactionBegin;

    private Long replicatedRecords;

    private String oldestActiveLsn;

    private String serverName;

    private String databaseName;

    private String markName;

    private Integer replPartitionId;

    private Integer replEpoch;

    private Long replCsn;

    private Integer replFlags;

    private String replSourceCommitTime;

    private String masterXdesid;

    private Integer masterDbid;

    private String preplogBeginLsn;

    private String prepareTime;

    private Long virtualClock;

    private String previousSavepoint;

    private String savepointName;

    private Short rowbitsFirstBit;

    private Short rowbitsBitCount;

    private Short numberOfLocks;

    private String lockInformation;

    private String lsnBeforeWrites;

    private Short pagesWritten;

    private Integer commandType;

    private Integer publicationId;

    private Integer articleId;

    private Integer partialStatus;

    private String command;

    private Short byteOffset;

    private String newSplitPage;

    private Short rowsDeleted;

    private Short bytesFreed;

    private Integer ciTableId;

    private Short ciIndexId;

    private Long newallocunitid;

    private Short filegroupId;

    private Short fileId;

    private String physicalName;

    private String logicalName;

    private String formatLsn;

    private Long rowsetid;

    private Integer columnOffset;

    private Integer flags;

    private Long textSize;

    private Long offset;

    private Long oldSize;

    private Long newSize;

    private String description;

    private Integer bulkAllocatedExtentCount;

    private Long bulkRowsetid;

    private Long bulkAllocunitid;

    private String bulkAllocationFirstIamPageId;

    private String bulkAllocatedExtentIds;

    private String vlfsAdded;

    private Integer invalidatecacheId;

    private String invalidatecacheKeys;

    private String copyverioninfoSourcePageId;

    private String copyverioninfoSourcePageLsn;

    private Integer copyverioninfoSourceSlotId;

    private Integer copyverioninfoSourceSlotCount;

    private Short compressionLogType;

    private Short pageformatPagetype;

    private Short pageformatPageflags;

    private Short pageformatPagelevel;

    private Short pageformatPagestat;

    private Short pageformatFormatoption;

    private String operationDesc;

    private Long txEndTimestamp;

    private Integer totalSize;

    private Long tableId;

    private Long newrowIdentity;

    private Integer newrowDatasize;

    private Long oldrowBeginTimestamp;

    private Long oldrowIdentity;

    private Integer oldrowKeyDatasize;

    private String xtpDescription;

    public String getCurrentLsn() {
        return currentLsn;
    }

    public void setCurrentLsn(String currentLsn) {
        this.currentLsn = currentLsn == null ? null : currentLsn.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public Long getLogblockgeneration() {
        return logblockgeneration;
    }

    public void setLogblockgeneration(Long logblockgeneration) {
        this.logblockgeneration = logblockgeneration;
    }

    public Short getLogRecordFixedLength() {
        return logRecordFixedLength;
    }

    public void setLogRecordFixedLength(Short logRecordFixedLength) {
        this.logRecordFixedLength = logRecordFixedLength;
    }

    public Short getLogRecordLength() {
        return logRecordLength;
    }

    public void setLogRecordLength(Short logRecordLength) {
        this.logRecordLength = logRecordLength;
    }

    public String getPreviousLsn() {
        return previousLsn;
    }

    public void setPreviousLsn(String previousLsn) {
        this.previousLsn = previousLsn == null ? null : previousLsn.trim();
    }

    public Integer getLogReserve() {
        return logReserve;
    }

    public void setLogReserve(Integer logReserve) {
        this.logReserve = logReserve;
    }

    public Long getAllocunitid() {
        return allocunitid;
    }

    public void setAllocunitid(Long allocunitid) {
        this.allocunitid = allocunitid;
    }

    public String getAllocunitname() {
        return allocunitname;
    }

    public void setAllocunitname(String allocunitname) {
        this.allocunitname = allocunitname == null ? null : allocunitname.trim();
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId == null ? null : pageId.trim();
    }

    public Integer getSlotId() {
        return slotId;
    }

    public void setSlotId(Integer slotId) {
        this.slotId = slotId;
    }

    public String getPreviousPageLsn() {
        return previousPageLsn;
    }

    public void setPreviousPageLsn(String previousPageLsn) {
        this.previousPageLsn = previousPageLsn == null ? null : previousPageLsn.trim();
    }

    public Long getPartitionid() {
        return partitionid;
    }

    public void setPartitionid(Long partitionid) {
        this.partitionid = partitionid;
    }

    public Short getRowflags() {
        return rowflags;
    }

    public void setRowflags(Short rowflags) {
        this.rowflags = rowflags;
    }

    public Short getNumElements() {
        return numElements;
    }

    public void setNumElements(Short numElements) {
        this.numElements = numElements;
    }

    public Short getOffsetInRow() {
        return offsetInRow;
    }

    public void setOffsetInRow(Short offsetInRow) {
        this.offsetInRow = offsetInRow;
    }

    public Short getModifySize() {
        return modifySize;
    }

    public void setModifySize(Short modifySize) {
        this.modifySize = modifySize;
    }

    public String getCheckpointBegin() {
        return checkpointBegin;
    }

    public void setCheckpointBegin(String checkpointBegin) {
        this.checkpointBegin = checkpointBegin == null ? null : checkpointBegin.trim();
    }

    public Short getChkptBeginDbVersion() {
        return chkptBeginDbVersion;
    }

    public void setChkptBeginDbVersion(Short chkptBeginDbVersion) {
        this.chkptBeginDbVersion = chkptBeginDbVersion;
    }

    public String getMaxXdesid() {
        return maxXdesid;
    }

    public void setMaxXdesid(String maxXdesid) {
        this.maxXdesid = maxXdesid == null ? null : maxXdesid.trim();
    }

    public Short getNumTransactions() {
        return numTransactions;
    }

    public void setNumTransactions(Short numTransactions) {
        this.numTransactions = numTransactions;
    }

    public String getCheckpointEnd() {
        return checkpointEnd;
    }

    public void setCheckpointEnd(String checkpointEnd) {
        this.checkpointEnd = checkpointEnd == null ? null : checkpointEnd.trim();
    }

    public Short getChkptEndDbVersion() {
        return chkptEndDbVersion;
    }

    public void setChkptEndDbVersion(Short chkptEndDbVersion) {
        this.chkptEndDbVersion = chkptEndDbVersion;
    }

    public String getMinimumLsn() {
        return minimumLsn;
    }

    public void setMinimumLsn(String minimumLsn) {
        this.minimumLsn = minimumLsn == null ? null : minimumLsn.trim();
    }

    public Integer getDirtyPages() {
        return dirtyPages;
    }

    public void setDirtyPages(Integer dirtyPages) {
        this.dirtyPages = dirtyPages;
    }

    public String getOldestReplicatedBeginLsn() {
        return oldestReplicatedBeginLsn;
    }

    public void setOldestReplicatedBeginLsn(String oldestReplicatedBeginLsn) {
        this.oldestReplicatedBeginLsn = oldestReplicatedBeginLsn == null ? null : oldestReplicatedBeginLsn.trim();
    }

    public String getNextReplicatedEndLsn() {
        return nextReplicatedEndLsn;
    }

    public void setNextReplicatedEndLsn(String nextReplicatedEndLsn) {
        this.nextReplicatedEndLsn = nextReplicatedEndLsn == null ? null : nextReplicatedEndLsn.trim();
    }

    public String getLastDistributedBackupEndLsn() {
        return lastDistributedBackupEndLsn;
    }

    public void setLastDistributedBackupEndLsn(String lastDistributedBackupEndLsn) {
        this.lastDistributedBackupEndLsn = lastDistributedBackupEndLsn == null ? null : lastDistributedBackupEndLsn.trim();
    }

    public String getLastDistributedEndLsn() {
        return lastDistributedEndLsn;
    }

    public void setLastDistributedEndLsn(String lastDistributedEndLsn) {
        this.lastDistributedEndLsn = lastDistributedEndLsn == null ? null : lastDistributedEndLsn.trim();
    }

    public String getReplMinHoldLsn() {
        return replMinHoldLsn;
    }

    public void setReplMinHoldLsn(String replMinHoldLsn) {
        this.replMinHoldLsn = replMinHoldLsn == null ? null : replMinHoldLsn.trim();
    }

    public Integer getServerUid() {
        return serverUid;
    }

    public void setServerUid(Integer serverUid) {
        this.serverUid = serverUid;
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Integer getXactType() {
        return xactType;
    }

    public void setXactType(Integer xactType) {
        this.xactType = xactType;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName == null ? null : transactionName.trim();
    }

    public String getParentTransactionId() {
        return parentTransactionId;
    }

    public void setParentTransactionId(String parentTransactionId) {
        this.parentTransactionId = parentTransactionId == null ? null : parentTransactionId.trim();
    }

    public String getOldestActiveTransactionId() {
        return oldestActiveTransactionId;
    }

    public void setOldestActiveTransactionId(String oldestActiveTransactionId) {
        this.oldestActiveTransactionId = oldestActiveTransactionId == null ? null : oldestActiveTransactionId.trim();
    }

    public Long getXactId() {
        return xactId;
    }

    public void setXactId(Long xactId) {
        this.xactId = xactId;
    }

    public Integer getXactNodeId() {
        return xactNodeId;
    }

    public void setXactNodeId(Integer xactNodeId) {
        this.xactNodeId = xactNodeId;
    }

    public Integer getXactNodeLocalId() {
        return xactNodeLocalId;
    }

    public void setXactNodeLocalId(Integer xactNodeLocalId) {
        this.xactNodeLocalId = xactNodeLocalId;
    }

    public Long getEndAge() {
        return endAge;
    }

    public void setEndAge(Long endAge) {
        this.endAge = endAge;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getTransactionBegin() {
        return transactionBegin;
    }

    public void setTransactionBegin(String transactionBegin) {
        this.transactionBegin = transactionBegin == null ? null : transactionBegin.trim();
    }

    public Long getReplicatedRecords() {
        return replicatedRecords;
    }

    public void setReplicatedRecords(Long replicatedRecords) {
        this.replicatedRecords = replicatedRecords;
    }

    public String getOldestActiveLsn() {
        return oldestActiveLsn;
    }

    public void setOldestActiveLsn(String oldestActiveLsn) {
        this.oldestActiveLsn = oldestActiveLsn == null ? null : oldestActiveLsn.trim();
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName == null ? null : markName.trim();
    }

    public Integer getReplPartitionId() {
        return replPartitionId;
    }

    public void setReplPartitionId(Integer replPartitionId) {
        this.replPartitionId = replPartitionId;
    }

    public Integer getReplEpoch() {
        return replEpoch;
    }

    public void setReplEpoch(Integer replEpoch) {
        this.replEpoch = replEpoch;
    }

    public Long getReplCsn() {
        return replCsn;
    }

    public void setReplCsn(Long replCsn) {
        this.replCsn = replCsn;
    }

    public Integer getReplFlags() {
        return replFlags;
    }

    public void setReplFlags(Integer replFlags) {
        this.replFlags = replFlags;
    }

    public String getReplSourceCommitTime() {
        return replSourceCommitTime;
    }

    public void setReplSourceCommitTime(String replSourceCommitTime) {
        this.replSourceCommitTime = replSourceCommitTime == null ? null : replSourceCommitTime.trim();
    }

    public String getMasterXdesid() {
        return masterXdesid;
    }

    public void setMasterXdesid(String masterXdesid) {
        this.masterXdesid = masterXdesid == null ? null : masterXdesid.trim();
    }

    public Integer getMasterDbid() {
        return masterDbid;
    }

    public void setMasterDbid(Integer masterDbid) {
        this.masterDbid = masterDbid;
    }

    public String getPreplogBeginLsn() {
        return preplogBeginLsn;
    }

    public void setPreplogBeginLsn(String preplogBeginLsn) {
        this.preplogBeginLsn = preplogBeginLsn == null ? null : preplogBeginLsn.trim();
    }

    public String getPrepareTime() {
        return prepareTime;
    }

    public void setPrepareTime(String prepareTime) {
        this.prepareTime = prepareTime == null ? null : prepareTime.trim();
    }

    public Long getVirtualClock() {
        return virtualClock;
    }

    public void setVirtualClock(Long virtualClock) {
        this.virtualClock = virtualClock;
    }

    public String getPreviousSavepoint() {
        return previousSavepoint;
    }

    public void setPreviousSavepoint(String previousSavepoint) {
        this.previousSavepoint = previousSavepoint == null ? null : previousSavepoint.trim();
    }

    public String getSavepointName() {
        return savepointName;
    }

    public void setSavepointName(String savepointName) {
        this.savepointName = savepointName == null ? null : savepointName.trim();
    }

    public Short getRowbitsFirstBit() {
        return rowbitsFirstBit;
    }

    public void setRowbitsFirstBit(Short rowbitsFirstBit) {
        this.rowbitsFirstBit = rowbitsFirstBit;
    }

    public Short getRowbitsBitCount() {
        return rowbitsBitCount;
    }

    public void setRowbitsBitCount(Short rowbitsBitCount) {
        this.rowbitsBitCount = rowbitsBitCount;
    }

    public Short getNumberOfLocks() {
        return numberOfLocks;
    }

    public void setNumberOfLocks(Short numberOfLocks) {
        this.numberOfLocks = numberOfLocks;
    }

    public String getLockInformation() {
        return lockInformation;
    }

    public void setLockInformation(String lockInformation) {
        this.lockInformation = lockInformation == null ? null : lockInformation.trim();
    }

    public String getLsnBeforeWrites() {
        return lsnBeforeWrites;
    }

    public void setLsnBeforeWrites(String lsnBeforeWrites) {
        this.lsnBeforeWrites = lsnBeforeWrites == null ? null : lsnBeforeWrites.trim();
    }

    public Short getPagesWritten() {
        return pagesWritten;
    }

    public void setPagesWritten(Short pagesWritten) {
        this.pagesWritten = pagesWritten;
    }

    public Integer getCommandType() {
        return commandType;
    }

    public void setCommandType(Integer commandType) {
        this.commandType = commandType;
    }

    public Integer getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(Integer publicationId) {
        this.publicationId = publicationId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getPartialStatus() {
        return partialStatus;
    }

    public void setPartialStatus(Integer partialStatus) {
        this.partialStatus = partialStatus;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public Short getByteOffset() {
        return byteOffset;
    }

    public void setByteOffset(Short byteOffset) {
        this.byteOffset = byteOffset;
    }

    public String getNewSplitPage() {
        return newSplitPage;
    }

    public void setNewSplitPage(String newSplitPage) {
        this.newSplitPage = newSplitPage == null ? null : newSplitPage.trim();
    }

    public Short getRowsDeleted() {
        return rowsDeleted;
    }

    public void setRowsDeleted(Short rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    public Short getBytesFreed() {
        return bytesFreed;
    }

    public void setBytesFreed(Short bytesFreed) {
        this.bytesFreed = bytesFreed;
    }

    public Integer getCiTableId() {
        return ciTableId;
    }

    public void setCiTableId(Integer ciTableId) {
        this.ciTableId = ciTableId;
    }

    public Short getCiIndexId() {
        return ciIndexId;
    }

    public void setCiIndexId(Short ciIndexId) {
        this.ciIndexId = ciIndexId;
    }

    public Long getNewallocunitid() {
        return newallocunitid;
    }

    public void setNewallocunitid(Long newallocunitid) {
        this.newallocunitid = newallocunitid;
    }

    public Short getFilegroupId() {
        return filegroupId;
    }

    public void setFilegroupId(Short filegroupId) {
        this.filegroupId = filegroupId;
    }

    public Short getFileId() {
        return fileId;
    }

    public void setFileId(Short fileId) {
        this.fileId = fileId;
    }

    public String getPhysicalName() {
        return physicalName;
    }

    public void setPhysicalName(String physicalName) {
        this.physicalName = physicalName == null ? null : physicalName.trim();
    }

    public String getLogicalName() {
        return logicalName;
    }

    public void setLogicalName(String logicalName) {
        this.logicalName = logicalName == null ? null : logicalName.trim();
    }

    public String getFormatLsn() {
        return formatLsn;
    }

    public void setFormatLsn(String formatLsn) {
        this.formatLsn = formatLsn == null ? null : formatLsn.trim();
    }

    public Long getRowsetid() {
        return rowsetid;
    }

    public void setRowsetid(Long rowsetid) {
        this.rowsetid = rowsetid;
    }

    public Integer getColumnOffset() {
        return columnOffset;
    }

    public void setColumnOffset(Integer columnOffset) {
        this.columnOffset = columnOffset;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Long getTextSize() {
        return textSize;
    }

    public void setTextSize(Long textSize) {
        this.textSize = textSize;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOldSize() {
        return oldSize;
    }

    public void setOldSize(Long oldSize) {
        this.oldSize = oldSize;
    }

    public Long getNewSize() {
        return newSize;
    }

    public void setNewSize(Long newSize) {
        this.newSize = newSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getBulkAllocatedExtentCount() {
        return bulkAllocatedExtentCount;
    }

    public void setBulkAllocatedExtentCount(Integer bulkAllocatedExtentCount) {
        this.bulkAllocatedExtentCount = bulkAllocatedExtentCount;
    }

    public Long getBulkRowsetid() {
        return bulkRowsetid;
    }

    public void setBulkRowsetid(Long bulkRowsetid) {
        this.bulkRowsetid = bulkRowsetid;
    }

    public Long getBulkAllocunitid() {
        return bulkAllocunitid;
    }

    public void setBulkAllocunitid(Long bulkAllocunitid) {
        this.bulkAllocunitid = bulkAllocunitid;
    }

    public String getBulkAllocationFirstIamPageId() {
        return bulkAllocationFirstIamPageId;
    }

    public void setBulkAllocationFirstIamPageId(String bulkAllocationFirstIamPageId) {
        this.bulkAllocationFirstIamPageId = bulkAllocationFirstIamPageId == null ? null : bulkAllocationFirstIamPageId.trim();
    }

    public String getBulkAllocatedExtentIds() {
        return bulkAllocatedExtentIds;
    }

    public void setBulkAllocatedExtentIds(String bulkAllocatedExtentIds) {
        this.bulkAllocatedExtentIds = bulkAllocatedExtentIds == null ? null : bulkAllocatedExtentIds.trim();
    }

    public String getVlfsAdded() {
        return vlfsAdded;
    }

    public void setVlfsAdded(String vlfsAdded) {
        this.vlfsAdded = vlfsAdded == null ? null : vlfsAdded.trim();
    }

    public Integer getInvalidatecacheId() {
        return invalidatecacheId;
    }

    public void setInvalidatecacheId(Integer invalidatecacheId) {
        this.invalidatecacheId = invalidatecacheId;
    }

    public String getInvalidatecacheKeys() {
        return invalidatecacheKeys;
    }

    public void setInvalidatecacheKeys(String invalidatecacheKeys) {
        this.invalidatecacheKeys = invalidatecacheKeys == null ? null : invalidatecacheKeys.trim();
    }

    public String getCopyverioninfoSourcePageId() {
        return copyverioninfoSourcePageId;
    }

    public void setCopyverioninfoSourcePageId(String copyverioninfoSourcePageId) {
        this.copyverioninfoSourcePageId = copyverioninfoSourcePageId == null ? null : copyverioninfoSourcePageId.trim();
    }

    public String getCopyverioninfoSourcePageLsn() {
        return copyverioninfoSourcePageLsn;
    }

    public void setCopyverioninfoSourcePageLsn(String copyverioninfoSourcePageLsn) {
        this.copyverioninfoSourcePageLsn = copyverioninfoSourcePageLsn == null ? null : copyverioninfoSourcePageLsn.trim();
    }

    public Integer getCopyverioninfoSourceSlotId() {
        return copyverioninfoSourceSlotId;
    }

    public void setCopyverioninfoSourceSlotId(Integer copyverioninfoSourceSlotId) {
        this.copyverioninfoSourceSlotId = copyverioninfoSourceSlotId;
    }

    public Integer getCopyverioninfoSourceSlotCount() {
        return copyverioninfoSourceSlotCount;
    }

    public void setCopyverioninfoSourceSlotCount(Integer copyverioninfoSourceSlotCount) {
        this.copyverioninfoSourceSlotCount = copyverioninfoSourceSlotCount;
    }

    public Short getCompressionLogType() {
        return compressionLogType;
    }

    public void setCompressionLogType(Short compressionLogType) {
        this.compressionLogType = compressionLogType;
    }

    public Short getPageformatPagetype() {
        return pageformatPagetype;
    }

    public void setPageformatPagetype(Short pageformatPagetype) {
        this.pageformatPagetype = pageformatPagetype;
    }

    public Short getPageformatPageflags() {
        return pageformatPageflags;
    }

    public void setPageformatPageflags(Short pageformatPageflags) {
        this.pageformatPageflags = pageformatPageflags;
    }

    public Short getPageformatPagelevel() {
        return pageformatPagelevel;
    }

    public void setPageformatPagelevel(Short pageformatPagelevel) {
        this.pageformatPagelevel = pageformatPagelevel;
    }

    public Short getPageformatPagestat() {
        return pageformatPagestat;
    }

    public void setPageformatPagestat(Short pageformatPagestat) {
        this.pageformatPagestat = pageformatPagestat;
    }

    public Short getPageformatFormatoption() {
        return pageformatFormatoption;
    }

    public void setPageformatFormatoption(Short pageformatFormatoption) {
        this.pageformatFormatoption = pageformatFormatoption;
    }

    public String getOperationDesc() {
        return operationDesc;
    }

    public void setOperationDesc(String operationDesc) {
        this.operationDesc = operationDesc == null ? null : operationDesc.trim();
    }

    public Long getTxEndTimestamp() {
        return txEndTimestamp;
    }

    public void setTxEndTimestamp(Long txEndTimestamp) {
        this.txEndTimestamp = txEndTimestamp;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public Long getNewrowIdentity() {
        return newrowIdentity;
    }

    public void setNewrowIdentity(Long newrowIdentity) {
        this.newrowIdentity = newrowIdentity;
    }

    public Integer getNewrowDatasize() {
        return newrowDatasize;
    }

    public void setNewrowDatasize(Integer newrowDatasize) {
        this.newrowDatasize = newrowDatasize;
    }

    public Long getOldrowBeginTimestamp() {
        return oldrowBeginTimestamp;
    }

    public void setOldrowBeginTimestamp(Long oldrowBeginTimestamp) {
        this.oldrowBeginTimestamp = oldrowBeginTimestamp;
    }

    public Long getOldrowIdentity() {
        return oldrowIdentity;
    }

    public void setOldrowIdentity(Long oldrowIdentity) {
        this.oldrowIdentity = oldrowIdentity;
    }

    public Integer getOldrowKeyDatasize() {
        return oldrowKeyDatasize;
    }

    public void setOldrowKeyDatasize(Integer oldrowKeyDatasize) {
        this.oldrowKeyDatasize = oldrowKeyDatasize;
    }

    public String getXtpDescription() {
        return xtpDescription;
    }

    public void setXtpDescription(String xtpDescription) {
        this.xtpDescription = xtpDescription == null ? null : xtpDescription.trim();
    }
}